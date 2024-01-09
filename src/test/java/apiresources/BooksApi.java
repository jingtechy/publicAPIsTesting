package apiresources;

import io.restassured.response.Response;
import models.books.Book;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class BooksApi {

    public static Book getBook() {
        String bookEndpoint = "https://openlibrary.org/api/books?bibkeys=ISBN:0201558025,LCCN:93005405&format=json";

        Book book = given()
                .header("Content-Type", "application/json")
                .when()
                .get(bookEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .body()
                .as(Book.class);

        return book;
    }

    public static Response getCovers() {
        String coversEndpoint = "http://covers.openlibrary.org/b/isbn/0385472579-S.jpg";

        Response response  = given()
                .header("Content-Type", "application/json")
                .when()
                .get(coversEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .response();

        return response;
    }
}
