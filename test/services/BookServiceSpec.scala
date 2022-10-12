package services

import baseSpec.{BaseSpec, BaseSpecWithApplication}
import cats.data.EitherT
import connectors.BookConnector
import models.APIError.JsonError
import models.{APIError, BookModel}
import org.scalamock.scalatest.MockFactory
import org.scalatest.concurrent.ScalaFutures
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.libs.json.{JsObject, JsValue, Json, OFormat}
import repositories.TraitDataRepo

import scala.concurrent.{ExecutionContext, Future}


class BookServiceSpec extends BaseSpec with MockFactory with ScalaFutures with GuiceOneAppPerSuite{

  val mockConnector = mock[BookConnector]
  val mockRepository = mock[TraitDataRepo]
  val testService = new BookService(mockConnector, mockRepository)
  implicit val formats: OFormat[BookModel] = Json.format[BookModel]
  implicit val executionContext: ExecutionContext = app.injector.instanceOf[ExecutionContext]

  val gameOfThrones: JsValue = Json.obj(
    "id" -> "someId",
    "title" -> "A Game of Thrones",
    "description" -> "The best book!!!",
    "pageCount" -> 100
  )

  "getGoogleBook" should {
    val url: String = "testUrl"

    "return a book" in {

      (mockConnector.get[BookModel](_: String)(_: OFormat[BookModel], _: ExecutionContext))
        .expects(url, *, *).returning(EitherT.rightT[Future, APIError](gameOfThrones.as[BookModel])).once()


      whenReady(testService.getGoogleBook(search = "", term = "").value) { result =>
        result shouldBe Right(BookModel("someId", "A Game of Thrones", "The best book!!!", 100))
      }

    }

    "return an error" in {
      val url: String = "testUrl"

      (mockConnector.get[JsObject](_: String)(_: OFormat[JsObject], _: ExecutionContext))
        .expects(url, *, *)
        .returning(EitherT.leftT[Future, BookModel](JsonError(400, "Could not connect"))).once()

      whenReady(testService.getGoogleBook(search = "", term = "").value) { result =>
        result shouldBe Left(JsonError(400, "Could not connect"))
      }
    }
  }

  "addApiUser" should {
    val url: String = "https://www.googleapis.com/books/v1/volumes?q=%"

    "return book for api and add to mongodb" in {

      (mockConnector.get[BookModel](_: String)(_: OFormat[BookModel], _: ExecutionContext))
        .expects(url, *, *)
        .returning(EitherT.rightT[Future, APIError](gameOfThrones.as[BookModel])).once()

      (mockRepository.create(_: BookModel)).expects(*)
        .returning(Future(Right(gameOfThrones.as[BookModel]))).once()

      whenReady(testService.addApiUser("", "")) { result =>
        result shouldBe(Right(gameOfThrones.as[BookModel]))
      }

    }

    "return error from api and not add to mongodb" in {

      (mockConnector.get[JsObject](_: String)(_: OFormat[JsObject], _: ExecutionContext))
        .expects(url, *, *)
        .returning(EitherT.leftT[Future, BookModel](JsonError(400, "Could not connect"))).once()

//      (mockRepository.create(_: DataModel)).expects(*)
//        .returning(Future(Left(APIError.BadAPIResponse(415, "could not make book")))).once()
//should never be called as success case of the getGoogleBook calls it

      whenReady(testService.addApiUser("", "")) { result =>
        result shouldBe Left(APIError.BadAPIResponse(400, "could not add book"))
      }

    }
  }

}
