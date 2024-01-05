package apitests;

import apiresources.AnimalsApi;
import models.animals.CatFacts;
import models.animals.DogBreeds;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class AnimalsTest {

    @Test
    public void catFactsApiTest() {

        List<CatFacts.CatFact> catFactList = AnimalsApi.getCatFacts();

        boolean anyCatFactWithVerified = catFactList.stream().anyMatch(catFact -> catFact.getStatus().isVerified());
        boolean anyCatFactWithExpectedSentCount = catFactList.stream().anyMatch(catFact -> catFact.getStatus().getSentCount() == 1);
        boolean anyCatFactWithExpectedV = catFactList.stream().anyMatch(catFact -> catFact.get__v() == 0);
        boolean anyCatFactWithExpectedSource = catFactList.stream().anyMatch(catFact -> catFact.getSource().equalsIgnoreCase("user"));
        boolean anyCatFactWithExpectedType = catFactList.stream().anyMatch(catFact -> catFact.getType().equalsIgnoreCase("cat"));
        boolean anyCatFactWithDeleted = catFactList.stream().anyMatch(CatFacts.CatFact::isDeleted);

        assertThat(anyCatFactWithVerified).isTrue();
        assertThat(anyCatFactWithExpectedSentCount).isTrue();
        assertThat(anyCatFactWithExpectedV).isTrue();
        assertThat(anyCatFactWithExpectedSource).isTrue();
        assertThat(anyCatFactWithExpectedType).isTrue();
        assertThat(anyCatFactWithDeleted).isFalse();
        assertThat(catFactList.get(0).isUsed()).isFalse();
        assertThat(catFactList.get(0).getText().equalsIgnoreCase("Owning a cat can reduce the risk of stroke and heart attack by a third.")).isTrue();
        assertThat(catFactList.get(1).getText().equalsIgnoreCase("Most cats are lactose intolerant, and milk can cause painful stomach cramps and diarrhea. It's best to forego the milk and just give your cat the standard: clean, cool drinking water.")).isTrue();
        assertThat(catFactList.get(2).getText().equalsIgnoreCase("Domestic cats spend about 70 percent of the day sleeping and 15 percent of the day grooming.")).isTrue();
        assertThat(catFactList.get(3).getText().equalsIgnoreCase("The frequency of a domestic cat's purr is the same at which muscles and bones repair themselves.")).isTrue();
        assertThat(catFactList.get(4).getText().equalsIgnoreCase("Cats are the most popular pet in the United States: There are 88 million pet cats and 74 million dogs.")).isTrue();
    }

    @Test
    public void dogBreedsApiTest() {

        DogBreeds dogBreeds = AnimalsApi.getDogBreeds();

        List<String> expectedBullDog = Arrays.asList("boston","english","french");
        List<String> expectedHound = Arrays.asList("afghan","basset","blood","english","ibizan","plott","walker");
        List<String> expectedMastiff = Arrays.asList("bull","english","tibetan");
        List<String> expectedMountain= Arrays.asList("bernese","swiss");
        List<String> expectedPointer= Arrays.asList("german","germanlonghair");
        List<String> expectedPoodle= Arrays.asList("medium","miniature","standard","toy");
        List<String> expectedRetriever= Arrays.asList("chesapeake","curly","flatcoated","golden");
        List<String> expectedSchnauzer= Arrays.asList("giant","miniature");
        List<String> expectedSetter= Arrays.asList("english","gordon","irish");
        List<String> expectedSheepdog= Arrays.asList("english","shetland");
        List<String> expectedSpaniel= Arrays.asList("blenheim","brittany","cocker","irish","japanese","sussex","welsh");
        List<String> expectedTerrier= Arrays.asList("american","australian","bedlington","cairn","dandie","fox","irish",
                "kerryblue","lakeland","norfolk","norwich","patterdale","russell","scottish","sealyham","silky","tibetan",
                "toy","welsh","westhighland","wheaten","yorkshire");

        assertThat(dogBreeds.getMessage().get("australian").contains("shepherd")).isTrue();
        assertThat(dogBreeds.getMessage().get("buhund").contains("norwegian")).isTrue();
        assertThat(dogBreeds.getMessage().get("bulldog").containsAll(expectedBullDog)).isTrue();
        assertThat(dogBreeds.getMessage().get("bullterrier").contains("staffordshire")).isTrue();
        assertThat(dogBreeds.getMessage().get("cattledog").contains("australian")).isTrue();
        assertThat(dogBreeds.getMessage().get("collie").contains("border")).isTrue();
        assertThat(dogBreeds.getMessage().get("corgi").contains("cardigan")).isTrue();
        assertThat(dogBreeds.getMessage().get("dane").contains("great")).isTrue();
        assertThat(dogBreeds.getMessage().get("deerhound").contains("scottish")).isTrue();
        assertThat(dogBreeds.getMessage().get("elkhound").contains("norwegian")).isTrue();
        assertThat(dogBreeds.getMessage().get("finnish").contains("lapphund")).isTrue();
        assertThat(dogBreeds.getMessage().get("frise").contains("bichon")).isTrue();
        assertThat(dogBreeds.getMessage().get("greyhound").contains("italian")).isTrue();
        assertThat(dogBreeds.getMessage().get("hound").containsAll(expectedHound)).isTrue();
        assertThat(dogBreeds.getMessage().get("mastiff").containsAll(expectedMastiff)).isTrue();
        assertThat(dogBreeds.getMessage().get("mountain").containsAll(expectedMountain)).isTrue();
        assertThat(dogBreeds.getMessage().get("ovcharka").contains("caucasian")).isTrue();
        assertThat(dogBreeds.getMessage().get("pinscher").contains("miniature")).isTrue();
        assertThat(dogBreeds.getMessage().get("pointer").containsAll(expectedPointer)).isTrue();
        assertThat(dogBreeds.getMessage().get("poodle").containsAll(expectedPoodle)).isTrue();
        assertThat(dogBreeds.getMessage().get("retriever").containsAll(expectedRetriever)).isTrue();
        assertThat(dogBreeds.getMessage().get("ridgeback").contains("rhodesian")).isTrue();
        assertThat(dogBreeds.getMessage().get("schnauzer").containsAll(expectedSchnauzer)).isTrue();
        assertThat(dogBreeds.getMessage().get("segugio").contains("italian")).isTrue();
        assertThat(dogBreeds.getMessage().get("setter").containsAll(expectedSetter)).isTrue();
        assertThat(dogBreeds.getMessage().get("sheepdog").containsAll(expectedSheepdog)).isTrue();
        assertThat(dogBreeds.getMessage().get("spaniel").containsAll(expectedSpaniel)).isTrue();
        assertThat(dogBreeds.getMessage().get("spitz").contains("japanese")).isTrue();
        assertThat(dogBreeds.getMessage().get("springer").contains("english")).isTrue();
        assertThat(dogBreeds.getMessage().get("terrier").containsAll(expectedTerrier)).isTrue();
        assertThat(dogBreeds.getMessage().get("waterdog").contains("spanish")).isTrue();
        assertThat(dogBreeds.getMessage().get("wolfhound").contains("irish")).isTrue();
        assertThat(dogBreeds.getStatus().equalsIgnoreCase("success")).isTrue();
    }


}
