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

        boolean anyCatFactWithVerified = catFactList.stream().anyMatch(catFact -> catFact.getStatus().isVerified());
        boolean anyCatFactWithExpectedSentCount = catFactList.stream().anyMatch(catFact -> catFact.getStatus().getSentCount() == 1);
        boolean anyCatFactWithExpectedV = catFactList.stream().anyMatch(catFact -> catFact.get__v() == 0);
        boolean anyCatFactWithExpectedSource = catFactList.stream().anyMatch(catFact -> catFact.getSource().equalsIgnoreCase("user"));
        boolean anyCatFactWithExpectedType = catFactList.stream().anyMatch(catFact -> catFact.getType().equalsIgnoreCase("cat"));
        boolean anyCatFactWithDeleted = catFactList.stream().anyMatch(catFact -> catFact.isDeleted());

        assertThat(anyCatFactWithVerified).isTrue();
        assertThat(anyCatFactWithExpectedSentCount).isTrue();
        assertThat(anyCatFactWithExpectedV).isTrue();
        assertThat(anyCatFactWithExpectedSource).isTrue();
        assertThat(anyCatFactWithExpectedType).isTrue();
        assertThat(anyCatFactWithDeleted).isFalse();
        assertThat(catFactList.get(0).isUsed()).isFalse();
        assertThat(catFactList.get(0).getText().equalsIgnoreCase("Owning a cat can reduce the risk of stroke and heart attack by a third."));
        assertThat(catFactList.get(1).getText().equalsIgnoreCase("Most cats are lactose intolerant, and milk can cause painful stomach cramps and diarrhea. It's best to forego the milk and just give your cat the standard: clean, cool drinking water."));
        assertThat(catFactList.get(2).getText().equalsIgnoreCase("Domestic cats spend about 70 percent of the day sleeping and 15 percent of the day grooming."));
        assertThat(catFactList.get(3).getText().equalsIgnoreCase("The frequency of a domestic cat's purr is the same at which muscles and bones repair themselves."));
        assertThat(catFactList.get(4).getText().equalsIgnoreCase("Cats are the most popular pet in the United States: There are 88 million pet cats and 74 million dogs."));
    }


}
