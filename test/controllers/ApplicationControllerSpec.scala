package controllers

import baseSpec.BaseSpecWithApplication
import models.{BookModel, Field}
import play.api.http.Status
import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{AnyContentAsEmpty, Result}
import play.api.test.FakeRequest
import play.api.test.Helpers.{contentAsJson, defaultAwaitTimeout, status}

import scala.concurrent.Future





class ApplicationControllerSpec extends BaseSpecWithApplication {

  //integration testing
  val TestApplicationController = new ApplicationController(
    component,
    serviceLayer,
    service
  )


  private val dataModel: BookModel = BookModel(
    "abcd",
    "testname",
    "test description",
    100
  )
  private val updatedDataModel: BookModel = BookModel(
    "abcd",
    "updated test name",
    "test description",
    100
  )
  private val googleDataModel: BookModel = BookModel(
    "VpNa9UckT24C",
    "Mountain View",
    "Mountain View earned its name for its scenic vantage point between the Santa Cruz and Diablo ranges. Founded as a stagecoach stop along the El Camino Real in 1852, Mountain View became a diverse and bountiful agricultural community in the \"Valley of Heart's Delight.\" During the depths of the Depression, Bay Area citizens raised almost half a million dollars to purchase land north of town that was offered to the navy. The gamble paid off with the opening of Moffett Naval Air Station in 1933, inaugurating Mountain View's turn toward commercial and residential development. It was in an old apricot storage barn on San Antonio Road that William Shockley founded the first silicon manufacturing company in 1956, making it the true birthplace of the \"Silicon Valley.\"",
    128
  )
  private val updatedNumField: Field = Field(
    "pageCount",
    "3500"
  )
  private val updatedField: Field = Field(
    "title",
    "updated field name"
  )

  //val url = "https://www.googleapis.com/books/v1/volumes?q=rowling%potter"


//integration testing

  "ApplicationController .index" should {

    val result = TestApplicationController.index()(FakeRequest())

    "return" in {
      status(result) shouldBe Status.OK
    }

  }

  "ApplicationController .create()" should {

    "create a book in the database" in {
      beforeEach()

      val request: FakeRequest[JsValue] = buildPost("/api/create").withBody[JsValue](Json.toJson(dataModel))
      val createdResult: Future[Result] = TestApplicationController.create()(request)

      status(createdResult) shouldBe Status.CREATED
      contentAsJson(createdResult).as[BookModel] shouldBe BookModel("abcd", "testname", "test description", 100)
      afterEach()

    }

    "try to create a book in the database with wrong format" in {
      beforeEach()
      val request = buildPost("/api/create").withBody[JsValue](Json.obj())
      val createdResult = TestApplicationController.create()(request)
      status(createdResult) shouldBe Status.INTERNAL_SERVER_ERROR
      contentAsJson(createdResult) shouldBe Json.toJson("Bad response from upstream; got status: 415, and got reason could not make book")
      afterEach()
    }

  }

  "ApplicationController .read()" should {

    "find a book in the database by id" in {
      beforeEach()
      val request: FakeRequest[JsValue] = buildPost("/api/create").withBody[JsValue](Json.toJson(dataModel))
      val readRequest: FakeRequest[AnyContentAsEmpty.type] = buildGet("/api/abcd")
      val createdResult: Future[Result] = TestApplicationController.create()(request)
      val readResult: Future[Result] = TestApplicationController.read("abcd")(readRequest) //need to uncomment readRequest
      //val readResult: Future[Result] = TestApplicationController.read("abcd")(FakeRequest()) // works without having readRequest

      status(createdResult) shouldBe Status.CREATED
      contentAsJson(createdResult).as[BookModel] shouldBe BookModel("abcd", "testname", "test description", 100)
      status(readResult) shouldBe Status.OK
      contentAsJson(readResult).as[BookModel] shouldBe BookModel("abcd", "testname", "test description", 100)
      afterEach()
    }

    "cannot find a book in the database as id does not exist" in {
      beforeEach()
      val readRequest: FakeRequest[AnyContentAsEmpty.type] = buildGet("/api/5")
      val readResult: Future[Result] = TestApplicationController.read("5")(readRequest)

      status(readResult) shouldBe Status.INTERNAL_SERVER_ERROR
      contentAsJson(readResult) shouldBe Json.toJson("Bad response from upstream; got status: 404, and got reason could not find book")
      afterEach()
    }

  }
  "ApplicationController .readName()" should {

    "find a book in the database by name" in {
      beforeEach()
      val request: FakeRequest[JsValue] = buildPost("/api/create").withBody[JsValue](Json.toJson(dataModel))
      val readRequest: FakeRequest[AnyContentAsEmpty.type] = buildGet("/api/name/testname")
      val createdResult: Future[Result] = TestApplicationController.create()(request)
      val readResult: Future[Result] = TestApplicationController.readName("testname")(readRequest)

      status(createdResult) shouldBe Status.CREATED
      contentAsJson(createdResult).as[BookModel] shouldBe BookModel("abcd", "testname", "test description", 100)
      status(readResult) shouldBe Status.OK
      contentAsJson(readResult).as[BookModel] shouldBe BookModel("abcd", "testname", "test description", 100)
      afterEach()
    }

    "cannot find a book in the database as name which does not exist" in {
      beforeEach()
      val readRequest: FakeRequest[AnyContentAsEmpty.type] = buildGet("/api/name/jelly")
      val readResult: Future[Result] = TestApplicationController.read("jelly")(readRequest)

      status(readResult) shouldBe Status.INTERNAL_SERVER_ERROR
      contentAsJson(readResult) shouldBe Json.toJson("Bad response from upstream; got status: 404, and got reason could not find book")
      afterEach()
    }
  }

  "ApplicationController .update()" should {

    "find a book in the database by id and update the fields" in {
      beforeEach()
      val request: FakeRequest[JsValue] = buildPost("/api").withBody[JsValue](Json.toJson(dataModel))
      val updateRequest: FakeRequest[JsValue] = buildPut("/api/abcd").withBody[JsValue](Json.toJson(updatedDataModel))
      val createdResult: Future[Result] = TestApplicationController.create()(request)
      val updateResult: Future[Result] = TestApplicationController.update("abcd")(updateRequest)

      status(createdResult) shouldBe Status.CREATED
      status(updateResult) shouldBe Status.ACCEPTED
      contentAsJson(updateResult).as[BookModel] shouldBe BookModel("abcd", "updated test name", "test description", 100)
      afterEach()
    }

    "try update a book by an id that does not exist and non conforming body format" in {
      beforeEach()
      val updateRequest = buildPut("/api/4").withBody[JsValue](Json.obj())

      val updateResult = TestApplicationController.update("4")(updateRequest)

      status(updateResult) shouldBe Status.INTERNAL_SERVER_ERROR
      contentAsJson(updateResult) shouldBe Json.toJson("Bad response from upstream; got status: 400, and got reason could not update book")
      afterEach()
    }

  }

  "ApplicationController .updateField()" should {

    "update one string field finding book by id " in {
      beforeEach()
      val request: FakeRequest[JsValue] = buildPost("/api").withBody[JsValue](Json.toJson(dataModel))
      val createdResult: Future[Result] = TestApplicationController.create()(request)
      val updateRequest: FakeRequest[JsValue] = buildPut("/api/update/abcd").withBody[JsValue](Json.toJson(updatedField))
      val updateResult: Future[Result] = TestApplicationController.updateField("abcd")(updateRequest)

      status(createdResult) shouldBe Status.CREATED
      status(updateResult) shouldBe Status.ACCEPTED
      contentAsJson(updateResult) shouldBe Json.toJson(BookModel("abcd", "updated field name", "test description", 100))

      afterEach()
    }

    "update one Int field finding book by id" in {
      beforeEach()
      val request: FakeRequest[JsValue] = buildPost("/api").withBody[JsValue](Json.toJson(dataModel))
      val updateRequest: FakeRequest[JsValue] = buildPut("/api/update/abcd").withBody[JsValue](Json.toJson(updatedNumField))
      val createdResult: Future[Result] = TestApplicationController.create()(request)
      val updateResult: Future[Result] = TestApplicationController.updateField("abcd")(updateRequest)

      status(createdResult) shouldBe Status.CREATED
      status(updateResult) shouldBe Status.ACCEPTED
      contentAsJson(updateResult) shouldBe Json.toJson(BookModel("abcd", "testname", "test description", 3500))
      afterEach()
    }

    "try update a book by an id that does not exist and non conforming body format" in {
      beforeEach()
      val updateRequest = buildPut("/api/4").withBody[JsValue](Json.obj())

      val updateResult = TestApplicationController.updateField("4")(updateRequest)

      status(updateResult) shouldBe Status.INTERNAL_SERVER_ERROR
      contentAsJson(updateResult) shouldBe Json.toJson("Bad response from upstream; got status: 400, and got reason could not update book")
      afterEach()
    }

  }


  "ApplicationController .delete()" should {

      "find a book in the database by id and delete" in {
        beforeEach()
        val request: FakeRequest[JsValue] = buildPost("/api").withBody[JsValue](Json.toJson(dataModel))
        val deleteRequest: FakeRequest[AnyContentAsEmpty.type ] = buildDelete("/api/abcd")
        val createdResult: Future[Result] = TestApplicationController.create()(request)
        val deleteResult: Future[Result] = TestApplicationController.delete("abcd")(deleteRequest)

        status(createdResult) shouldBe Status.CREATED
        status(deleteResult) shouldBe Status.ACCEPTED
        afterEach()
      }

    "cannot find a book in the database as id and cannot delete" in {
      beforeEach()
      val deleteRequest: FakeRequest[AnyContentAsEmpty.type] = buildDelete("/api/8")

      val deleteResult: Future[Result] = TestApplicationController.delete("8")(deleteRequest)

      status(deleteResult) shouldBe Status.INTERNAL_SERVER_ERROR
      contentAsJson(deleteResult) shouldBe Json.toJson("Bad response from upstream; got status: 404, and got reason could not delete book")
      afterEach()
    }

  }

  "ApplicationController .getGoogleBook()" should {

    "find a book in the database by search and term" in {
      beforeEach()
      val googleRequest: FakeRequest[AnyContentAsEmpty.type] = buildGet("/library/google/0738531367/mountain")
      val googleResult= TestApplicationController.getGoogleBook("0738531367", "mountain")(googleRequest)


      status(googleResult) shouldBe Status.OK
      contentAsJson(googleResult) shouldBe Json.toJson(googleDataModel)

      afterEach()
    }

    "unable to find a book in the database by search and term" in {
      beforeEach()
      val googleRequest: FakeRequest[AnyContentAsEmpty.type] = buildGet("/library/google/0738532/mountain")
      val googleResult= TestApplicationController.getGoogleBook("0738532", "mountain")(googleRequest)


      status(googleResult) shouldBe Status.BAD_REQUEST
      contentAsJson(googleResult) shouldBe Json.toJson("could not validate book")


      afterEach()
    }

  }



  override def beforeEach(): Unit = repository.deleteAll()
  override def afterEach(): Unit = repository.deleteAll()

}
