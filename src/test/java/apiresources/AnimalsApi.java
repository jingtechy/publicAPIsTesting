package apiresources;

import io.restassured.response.Response;
import models.animals.CatFacts;
import models.animals.DogBreeds;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class AnimalsApi {
    public static List<CatFacts.CatFact> getCatFactsApi() {
        String catFactsEndpoint = "https://cat-fact.herokuapp.com/facts/";

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get(catFactsEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .response();

        // Deserialize the JSON array directly into a List<CatFact>
        List<CatFacts.CatFact> catFacts = response.jsonPath().getList("$", CatFacts.CatFact.class);

        return catFacts;
    }

    public static DogBreeds getDogBreedsApi() {
        String dogBreedsEndpoint = "https://dog.ceo/api/breeds/list/all";

        DogBreeds dogBreeds = given()
                .header("Content-Type", "application/json")
                .when()
                .get(dogBreedsEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .body()
                .as(DogBreeds.class);

        return dogBreeds;
    }
}

