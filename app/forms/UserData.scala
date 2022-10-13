package forms

import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.{Constraint, Invalid, Valid, ValidationError}
import play.api.data.validation.Constraints._


case class UserData(usernameEmail: String, name: String, password: String)

object UserData{
  val userForm = Form(
    mapping(
      "usernameEmail" -> email,
      "name" -> nonEmptyText,
      "password" -> nonEmptyText.verifying(nonEmpty)
    )(UserData.apply)(UserData.unapply)
  )




  val allNumbers = """\d*""".r
  val allLetters = """[A-Za-z]*""".r

  val passwordCheck: Mapping[String] = nonEmptyText(minLength = 7)
    .verifying(passwordCheckConstraint)

  val passwordCheckConstraint: Constraint[String] = Constraint("constraints.passwordcheck")({ plainText =>
    val errors = plainText match {
      case allNumbers() => Seq(ValidationError("Password is all numbers"))
      case allLetters() => Seq(ValidationError("Password is all letters"))
      case _            => Nil
    }
    if (errors.isEmpty) {
      Valid
    } else {
      Invalid(errors)
    }
  }
  )

}