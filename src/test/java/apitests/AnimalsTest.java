package apitests;

import apiresources.AnimalsApi;
import models.animals.CatFacts;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


public class AnimalsTest {

    @Test
    public void getCatFacts(){

        List<CatFacts.CatFact> catFactList = AnimalsApi.getCatFacts();

        assertThat(catFactList.get(0).getStatus().isVerified()).isTrue();


    }


}
