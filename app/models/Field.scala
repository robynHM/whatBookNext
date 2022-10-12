package models

import play.api.libs.json.{Json, OFormat}

case class Field(newName: String)
object Field {
  implicit val formats: OFormat[Field] = Json.format[Field]

}