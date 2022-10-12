package controllers

import models.{APIError, BookModel, ReadList, ReadingList, UserModel}
import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}
import services.{ApplicationService, BookService}

import javax.inject.{Inject, Singleton}
import scala.concurrent.ExecutionContext



@Singleton
class ApplicationController @Inject()(val controllerComponents: ControllerComponents, val applicationService: ApplicationService, val bookService: BookService)(implicit val ec: ExecutionContext) extends BaseController {

  def showReadingList(userName: String): Action[AnyContent] = Action.async { implicit request =>
    applicationService.showReadingList(userName).map{
      case Right(books: Seq[BookModel]) => Ok(views.html.readingList(books))
      case Left(error) => Status(error.httpResponseStatus)(Json.toJson(error.reason))
    }
  }

  def showReadList(userName: String): Action[AnyContent] = Action.async { implicit request =>
    applicationService.showReadList(userName).map{
      case Right(books: Seq[BookModel]) => Ok(views.html.readList(books))
      case Left(error) => Status(error.httpResponseStatus)(Json.toJson(error.reason))
    }
  }

  def findBook(search: String, term: String): Action[AnyContent] = Action.async { implicit request =>
    bookService.getGoogleBook(search = search, term = term).value.map{
      case Right(book: BookModel) => Ok(views.html.book(book))
      case Left(error) => Status(error.httpResponseStatus)(Json.toJson(error.reason))
    }
  }


  def showUserAccount(userName: String): Action[AnyContent] = Action.async { implicit request =>
    applicationService.returnUser(userName).map{
      case Right(user: UserModel) => Ok(views.html.userProfile(user))
      case Left(error) => Status(error.httpResponseStatus)(Json.toJson(error.reason))
    }
  }

  def addToReading(username: Option[String], search: String, term: String, bookid: String): Action[AnyContent] = Action.async { implicit request =>
    username match {
      case Some(user) => bookService.addBookToReading(search, term, user).map{
        case Right(book: UserModel) => Created(views.html.readingList(book.readingList))
        case Left(error: APIError) => Status(error.httpResponseStatus)(Json.toJson(error.reason))
      }
      case None => ???
    }

  }

  def createUser(): Action[JsValue] = Action.async(parse.json) { implicit request =>
    applicationService.createUser(request).map {
      case Right(value) => Created(Json.toJson(value))
      case Left(error) => Status(error.httpResponseStatus)(Json.toJson(error.reason))
    }
  }


  def updateUserName(userName: String): Action[JsValue] = Action.async(parse.json) { implicit request =>
    applicationService.updateName(userName, request).map {
      case Right(user: UserModel) => Accepted(Json.toJson(user))
      case Left(error) => Status(error.httpResponseStatus)(Json.toJson(error.reason))
    }
  }


  def delete(userName: String): Action[AnyContent]= Action.async { implicit request =>
    applicationService.delete(userName).map{
      case Right(deleted: String) => Accepted
      case Left(error) => Status(error.httpResponseStatus)(Json.toJson(error.reason))

    }
  }


  def getGoogleBook(search: String, term: String): Action[AnyContent] = Action.async { implicit request =>
   bookService.getGoogleBook(search = search, term = term).value.map{
     case Right(book) => Ok(Json.toJson(book))
     case Left(error) => Status(error.httpResponseStatus)(Json.toJson(error.reason))
   }

  }

}

