package repositories

import com.google.inject.ImplementedBy
import models.{APIError, BookModel, UserModel}
import org.mongodb.scala.bson.conversions.Bson
import org.mongodb.scala.model.Filters.{empty, equal}
import org.mongodb.scala.model.Updates.{pull, push, set}
import org.mongodb.scala.model._
import uk.gov.hmrc.mongo.MongoComponent
import uk.gov.hmrc.mongo.play.json.PlayMongoRepository

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}

@ImplementedBy(classOf[DataRepository])
trait TraitDataRepo {
  def showReadingList(userName: String): Future[Either[APIError, Seq[BookModel]]]
  def showReadList(userName: String): Future[Either[APIError, Seq[BookModel]]]
  def createUser(user: UserModel): Future[Either[APIError, UserModel]]
  def returnUser(userName: String): Future[Either[APIError, UserModel]]
  def addToReading(userName: String, book: BookModel): Future[Either[APIError, UserModel]]
  def addToRead(userName: String, book: BookModel): Future[Either[APIError, UserModel]]
  def updateName(userName: String, value: String): Future[Either[APIError, UserModel]]
  def delete(userName: String): Future[Either[APIError, String]]
  def removeBookReading(userName: String, book: BookModel): Future[Either[APIError, UserModel]]
}

@Singleton
class DataRepository @Inject()(mongoComponent: MongoComponent)(implicit ec: ExecutionContext) extends PlayMongoRepository[UserModel] (
  collectionName = "bookUserModels",
  mongoComponent = mongoComponent,
  domainFormat = UserModel.formats,
  indexes = Seq(IndexModel(
    Indexes.ascending("userName")
  )
)) with TraitDataRepo {



  def showReadingList(userName: String): Future[Either[APIError, Seq[BookModel]]]  =
    collection.find(byUserName(userName)).headOption flatMap {
      case Some(value) =>
        Future(Right(value.readingList))
      case _ => Future(Left(APIError.BadAPIResponse(400, "could not find reading list")))
    }

  def showReadList(userName: String): Future[Either[APIError, Seq[BookModel]]]  =
    collection.find(byUserName(userName)).headOption flatMap {
      case Some(value) =>
        Future(Right(value.readList))
      case _ => Future(Left(APIError.BadAPIResponse(400, "could not find read list")))
    }

  def createUser(user: UserModel): Future[Either[APIError, UserModel]] =
    collection
       .insertOne(user)
       .toFutureOption()
       .map {
         case Some(value) if value.wasAcknowledged() => Right(user)
         case _ => Left(APIError.BadAPIResponse(415, "could not create user account"))
       }

  private def byUserName(userName: String): Bson =
    Filters.and(
      Filters.equal("userName", userName)
    )



  def returnUser(userName: String): Future[Either[APIError, UserModel]] = {
    collection.find(byUserName(userName)).headOption flatMap {
      case Some(user) =>
        Future(Right(user))
      case _ => Future(Left(APIError.BadAPIResponse(404, "could not find users account information")))
    }
  }


  def addToReading(userName: String, book: BookModel): Future[Either[APIError, UserModel]] = {
    collection.findOneAndUpdate(equal("userName", userName),
      push("readingList", book),
      options = FindOneAndUpdateOptions().returnDocument(ReturnDocument.AFTER))
      .toFutureOption().map{
      case Some(user: UserModel) => Right(user)
      case _ => Left(APIError.BadAPIResponse(400, "could not add book to reading list"))
    }
  }


  def addToRead(userName: String, book: BookModel): Future[Either[APIError, UserModel]] = {
    collection.findOneAndUpdate(equal("userName", userName),
      push("readList", book),
      options = FindOneAndUpdateOptions().returnDocument(ReturnDocument.AFTER))
      .toFutureOption().map{
      case Some(user: UserModel) => Right(user)
      case _ => Left(APIError.BadAPIResponse(400, "could not add book to read list"))
    }
  }

  def updateName(userName: String, value: String): Future[Either[APIError, UserModel]]= {
      collection.findOneAndUpdate(equal("userName", userName),
        set("name", value),
        options = FindOneAndUpdateOptions().returnDocument(ReturnDocument.AFTER)
      ).toFutureOption().map {
        case Some(value: UserModel) => Right(value)
        case _ => Left(APIError.BadAPIResponse(400, "could not update name"))
      }
  }

  def delete(userName: String): Future[Either[APIError, String]] = {
    collection.deleteOne(
        filter = byUserName(userName)).toFutureOption().map{
      case Some(value) if value.getDeletedCount == 1 => Right("deleted")
      case _ =>  Left(APIError.BadAPIResponse(400, "could not delete user account"))
    }
  }

  def removeBookReading(userName: String, book: BookModel): Future[Either[APIError, UserModel]] = {
    collection.findOneAndUpdate(
      equal("userName", userName),
      pull("readingList", book)
    ).toFutureOption().map {
      case Some(user: UserModel) => Right(user)
      case _ => Left(APIError.BadAPIResponse(400, "could not remove book from reading list"))
    }
  }

  def deleteAll(): Future[Unit] = collection.deleteMany(empty()).toFuture().map(_ => ())

}
