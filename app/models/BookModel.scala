package models

import play.api.libs.json.{Json, OFormat}



case class BookModel(id: String, title: String, description: String, image: String, readingList: Boolean = false, readList: Boolean = false)
object BookModel {
  implicit val formats: OFormat[BookModel] = Json.format[BookModel]
}
