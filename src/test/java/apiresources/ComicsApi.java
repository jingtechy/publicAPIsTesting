package apiresources;

import models.comics.XKCD;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class ComicsApi {

    public static XKCD getXKCDComicApi() {

        String xkcdEndpoint = "https://xkcd.com/info.0.json";
        XKCD xkcd = given()
                .header("Content-Type", "application/json")
                .when()
                .get(xkcdEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .as(XKCD.class);

        return xkcd;
    }
}
