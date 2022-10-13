package services


import cats.data.EitherT
import connectors.BookConnector
import models.{APIError, BookModel, UserModel}
import repositories.TraitDataRepo

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}


@Singleton
class BookService @Inject()(connector: BookConnector, dataRepository: TraitDataRepo){

  def getGoogleBook(search: String, term: String)(implicit ec: ExecutionContext): EitherT[Future, APIError, BookModel] = {
    connector.get[BookModel](s"https://www.googleapis.com/books/v1/volumes?q=$search%$term")
  }

  def addBookToReading(search: String, term: String, userName: String)(implicit ec: ExecutionContext): Future[Either[APIError, UserModel]]= {
    getGoogleBook(search = search, term = term).value.flatMap{
      case Right(book: BookModel) => dataRepository.addToReading(userName, book)
      case Left(error) => Future(Left(APIError.BadAPIResponse(400, "could not add book to reading list")))
    }
  }

  def addBookToRead(search: String, term: String, userName: String)(implicit ec: ExecutionContext):Future[Either[APIError, UserModel]]= {
    getGoogleBook(search = search, term = term).value.flatMap{
      case Right(book: BookModel) => dataRepository.addToRead(userName, book)
      case Left(error) => Future(Left(APIError.BadAPIResponse(400, "could not add book to read list")))
    }
  }


}
