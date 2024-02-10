package apiresources;

import models.cryptocurrency.CurrentBitcoinPrice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class CryptocurrencyApi {

    public static CurrentBitcoinPrice getCurrentBitcoinPriceApi() {

        String currentBitcoinPriceEndpoint = "https://api.coindesk.com/v1/bpi/currentprice.json";
        CurrentBitcoinPrice currentBitcoinPrice = given()
                .header("Content-Type", "application/json")
                .when()
                .get(currentBitcoinPriceEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .as(CurrentBitcoinPrice.class);

        return currentBitcoinPrice;
    }
}