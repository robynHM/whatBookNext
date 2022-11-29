package services


import models.{APIError, BookModel, Field, UserModel}
import play.api.libs.json.{JsError, JsSuccess, JsValue, Json}
import play.api.mvc.Request
import repositories.TraitDataRepo
import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}


@Singleton
class ApplicationService @Inject()(dataRepository: TraitDataRepo)(implicit ec: ExecutionContext) {


  def showReadingList(userName: String): Future[Either[APIError, Seq[BookModel]]] = {
    dataRepository.showReadingList(userName).map {
      case Right(users: Seq[BookModel]) => Right(users)
      case Left(_) => Left(APIError.BadAPIResponse(404, "could not find books"))
    }
  }

  def showReadList(userName: String): Future[Either[APIError, Seq[BookModel]]] = {
    dataRepository.showReadList(userName).map {
      case Right(users: Seq[BookModel]) => Right(users)
      case Left(_) => Left(APIError.BadAPIResponse(404, "could not find books"))
    }
  }

  def createUser(newUser: UserModel): Future[Either[APIError, UserModel]] = {
    dataRepository.createUser(newUser).map {
      case Right(user: UserModel) => Right(user)
      case Left(_) => Left(APIError.BadAPIResponse(415, "could not create user account"))
    }

  }

  def returnUser(userName: String, password: Option[String] = None): Future[Either[APIError, UserModel]] = {
    dataRepository.returnUser(userName).map {
      case Right(user: UserModel) if user.password.equals(password.get) => Right(user)
      case Right(user: UserModel) => Left(APIError.BadAPIResponse(404, "password is incorrect"))
      case Left(errors) => Left(APIError.BadAPIResponse(404, "user does not exist"))
    }
  }


  //  def addToReading(userName: String, book: String): Future[Either[APIError, Seq[BookModel]]] = {
  //    dataRepository.addToReading(userName, book).map {
  //         case Left(value) => Left(APIError.BadAPIResponse(400, "could not update read list"))
  //         case Right(user) => Right(user.readingList)
  //       }
  //  }

  def addToRead(userName: String, input: Request[JsValue]): Future[Either[APIError, UserModel]] = {
    input.body.validate[BookModel] match {
      case JsSuccess(readList, _) =>
        dataRepository.addToRead(userName, readList)
      case JsError(errors) => Future(Left(APIError.BadAPIResponse(400, "could not update read list")))
    }
  }

  def updateName(userName: String, input: Request[JsValue]): Future[Either[APIError, UserModel]] = {
    input.body.validate[Field] match {
      case JsSuccess(field, _) => dataRepository.updateName(userName, field.newName)
      case JsError(errors) => Future(Left(APIError.BadAPIResponse(400, "could not update book")))
    }

  }

  def delete(id: String): Future[Either[APIError, String]] = {
    dataRepository.delete(id).map {
      case Right(deleted: String) => Right("deleted")
      case Left(error) => Left(APIError.BadAPIResponse(404, "could not delete book"))
    }
  }

  def removeBookReading(userName: String, book: BookModel): Future[Either[APIError, Seq[BookModel]]] = {
    dataRepository.removeBookReading(userName, book).map {
      case Left(value) => Left(APIError.BadAPIResponse(404, "could not delete book"))
      case Right(books) => Right(books.readingList)
    }
  }

}















