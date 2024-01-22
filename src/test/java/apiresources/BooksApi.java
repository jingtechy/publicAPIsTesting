package apiresources;

import io.restassured.response.Response;
import models.books.Book;
import models.books.Search;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class BooksApi {

    public static Book getBookApi() {
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

    public static Response getCoversApi() {
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

    public static Search getSearchApi() {
        String searchEndpoint = "http://openlibrary.org/search.json?q=the+lord+of+the+rings";

        Search search  = given()
                .header("Content-Type", "application/json")
                .when()
                .get(searchEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .body()
                .as(Search.class);

        return search;
    }
}
