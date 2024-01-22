package apiresources;

import models.cars.CarManufacturers;
import models.cars.MakesOfCars;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class CarsApi {

    public static MakesOfCars getMakesOfCarsApi() {

        String makesOfCarsEndpoint = "https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json";
        MakesOfCars makesOfCars = given()
                .header("Content-Type", "application/json")
                .when()
                .get(makesOfCarsEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .as(MakesOfCars.class);

        return makesOfCars;
    }

    public static CarManufacturers getCarManufacturersApi() {

        String carManufacturersEndpoint = "https://vpic.nhtsa.dot.gov/api/vehicles/getallmanufacturers?format=json";
        CarManufacturers carManufacturers = given()
                .header("Content-Type", "application/json")
                .when()
                .get(carManufacturersEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .as(CarManufacturers.class);

        return carManufacturers;
    }
}
