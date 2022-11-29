package connectors

import cats.data.EitherT
import models.{APIError, BookModel, GoogleBook}
import play.api.libs.json.{JsError, JsLookupResult, JsObject, JsSuccess, JsValue, Json, OFormat}
import play.api.libs.ws.{WSClient, WSResponse}

import java.nio.ByteBuffer
import java.util.Base64
import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}

class BookConnector @Inject()(ws: WSClient) {
  def get[Response](url: String)(implicit rds: OFormat[Response], ec: ExecutionContext): EitherT[Future, APIError, BookModel] = {
    val request = ws.url(url)
    val response = request.get()
    EitherT{
      response.map {
        result =>
          result.json.validate[GoogleBook] match {
            case JsSuccess(value, _) =>
              Right(BookModel(value.items.head.id, value.items.head.volumeInfo.title, value.items.head.volumeInfo.authors, value.items.head.volumeInfo.description, value.items.head.volumeInfo.imageLinks.thumbnail))
            case JsError(errors) =>
              val errorMessage = errors.map {
                case (_, es) => es.toString()
              }.flatten.mkString("/n")
              Left(APIError.JsonError(400, "could not validate book"))
          }

      }
    }
  }



}

