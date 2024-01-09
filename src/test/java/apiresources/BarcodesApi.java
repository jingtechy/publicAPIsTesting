package apiresources;

import models.barcodes.BarcodeLookup;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class BarcodesApi {
    public static BarcodeLookup getBarcodeLookup() {
        String barcodeLookupEndpoint = "https://world.openfoodfacts.org/api/v0/product/737628064502.json";

        BarcodeLookup barcodeLookup = given()
                .header("Content-Type", "application/json")
                .when()
                .get(barcodeLookupEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .body()
                .as(BarcodeLookup.class);

        return barcodeLookup;
    }
}
