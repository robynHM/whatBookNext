package models
import play.api.libs.json.{Json, OFormat}


case class UserModel(userName: String, name: String, readingList: Seq[BookModel], readList: Seq[BookModel])

object UserModel {
  implicit val formats: OFormat[UserModel] = Json.format[UserModel]
}



