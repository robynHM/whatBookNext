package controllers

import forms.{UserData, UserLogin}
import forms.UserData.userForm
import forms.UserLogin.userLoggingInForm
import models.{APIError, BookModel, UserModel}
import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents, Request}
import services.{ApplicationService, BookService}
import views.html.helper.CSRF

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}



@Singleton
class ApplicationController @Inject()(val controllerComponents: ControllerComponents, val applicationService: ApplicationService, val bookService: BookService)(implicit val ec: ExecutionContext) extends BaseController with play.api.i18n.I18nSupport{


  def home(): Action[AnyContent] = Action.async {implicit request =>
    Future.successful(Ok(views.html.home()))
  }

  def accessToken(implicit request: Request[_]) = {
    CSRF.getToken
  }

  def signIn(): Action[AnyContent] =  Action {implicit request =>
    Ok(views.html.signInUp(UserLogin.userLoggingInForm))
  }

  def signInPost(): Action[AnyContent] =  Action.async {implicit request =>
    accessToken
    userLoggingInForm.bindFromRequest().fold(
      formWithErrors => {
        Future(BadRequest(formWithErrors.errors.toString))
      },
      formData => {
        applicationService.returnUserWithPasswordCheck(formData.usernameEmail, Some(formData.password)).map {
          case Left(error) => BadRequest(Json.toJson("password or username did not match"))
          case Right(user) => Redirect(routes.ApplicationController.showUserAccount(user.userName))
        }
      }
    )
  }

  def signUp(): Action[AnyContent] = Action { implicit request =>
    Ok(views.html.signUp(UserData.userForm))
  }


  def signUpPost(): Action[AnyContent] = Action.async  { implicit request =>
    accessToken
    userForm.bindFromRequest().fold(
      formWithErrors => {
        Future(BadRequest(formWithErrors.errors.toString))
      },
      formData => {
        val newUser  = models.UserModel(formData.usernameEmail, formData.password, formData.name,  Seq(),  Seq())
        applicationService.createUser(newUser).map {
          case Left(value) => BadRequest(Json.toJson("could not create user account"))
          case Right(user) => Redirect(routes.ApplicationController.showUserAccount(user.userName))
        }
      }
    )
  }

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
      case None => Future(Ok(views.html.signInUp(UserLogin.userLoggingInForm)))
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

