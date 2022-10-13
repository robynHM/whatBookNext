package controllers

import forms.UserData
import forms.UserData.userForm
import models.{APIError, BookModel, UserModel}
import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}
import services.{ApplicationService, BookService}

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}



@Singleton
class ApplicationController @Inject()(val controllerComponents: ControllerComponents, val applicationService: ApplicationService, val bookService: BookService)(implicit val ec: ExecutionContext) extends BaseController {

  def home(): Action[AnyContent] = Action.async { implicit request =>
    Future.successful(Ok(views.html.home()))
  }

  def signIn(): Action[AnyContent] =  Action { implicit request =>
    Ok(views.html.signInUp(UserData.userForm))
  }

  def signInPost(): Action[AnyContent] =  ???
//  Action { implicit request =>
//    Ok(views.html.signInUp(UserData.userForm))
//  }

  def signUp() = Action { implicit request =>
    Ok(views.html.signUp(UserData.userForm))
  }

  def signUpPost() = Action.async { implicit request =>
    val bindForm = userForm.bindFromRequest.get
    val newUser  = models.UserModel(bindForm.usernameEmail, bindForm.password, bindForm.name,  Seq(),  Seq())
    applicationService.createUser(newUser).map {
      case Left(value) => BadRequest(Json.toJson("could not create user account"))
      case Right(user) => Redirect(routes.ApplicationController.showUserAccount(user.userName))
    }
  }

  //  def signUpPost() = Action.async(parse.form(userForm)) { implicit request =>
//    val userData = request.body
//    val newUser  = models.UserModel(userData.usernameEmail, userData.password, userData.name,  Seq(),  Seq())
//    applicationService.createUser(newUser).map {
//      case Left(value) => Ok(Json.toJson("could not create user account"))
//      case Right(value) => Redirect(routes.ApplicationController.showUserAccount(newUser.userName))
//    }
//  }

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
      case None => Future(Ok(views.html.signInUp(UserData.userForm)))
    }

  }

//  def createUser(): Action[JsValue] = Action.async(parse.json) { implicit request =>
//    applicationService.createUser(request).map {
//      case Right(value) => Created(Json.toJson(value))
//      case Left(error) => Status(error.httpResponseStatus)(Json.toJson(error.reason))
//    }
//  }


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

