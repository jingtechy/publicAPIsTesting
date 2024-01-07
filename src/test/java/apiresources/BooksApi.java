package apiresources;

import models.books.Book;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class BooksApi {

    public static Book getBook() {
        String endpoint = "https://openlibrary.org/api/books?bibkeys=ISBN:0201558025,LCCN:93005405&format=json";

        Book book = given()
                .header("Content-Type", "application/json")
                .when()
                .get(endpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .body()
                .as(Book.class);

        return book;
    }
}
