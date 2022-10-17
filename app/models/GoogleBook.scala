package models

import play.api.libs.json.{Json, OFormat}

case class Image(thumbnail: String)

case class VolumeInfo(imageLinks: Image, title: String, description: String, authors: Seq[String])

case class Item(id: String, volumeInfo: VolumeInfo)

case class GoogleBook(items: List[Item])

object GoogleBook {
  implicit val formats: OFormat[GoogleBook] = Json.format[GoogleBook]
}
object Item {
  implicit val formats: OFormat[Item] = Json.format[Item]
}

object VolumeInfo {
  implicit val formats: OFormat[VolumeInfo] = Json.format[VolumeInfo]
}
object Image {
  implicit val formats: OFormat[Image] = Json.format[Image]
}
