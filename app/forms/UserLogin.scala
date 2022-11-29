package forms

import play.api.data.Form
import play.api.data.Forms.{email, mapping, nonEmptyText}

case class UserLogin(usernameEmail: String, password: String)

object UserLogin {
  val userLoggingInForm = Form(
    mapping(
      "usernameEmail" -> email,
      "password" -> nonEmptyText
    )(UserLogin.apply)(UserLogin.unapply)
  )
}
