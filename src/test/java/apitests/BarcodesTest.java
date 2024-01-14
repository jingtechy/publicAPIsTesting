package apitests;

import apiresources.BarcodesApi;
import models.barcodes.BarcodeLookup;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BarcodesTest {

    @Test
    public void barcodeLookupApiTest() {

        BarcodeLookup barcodeLookup = BarcodesApi.getBarcodeLookup();
        List<String> expectedKeywords = Arrays.asList("asia","beverage","cereal","food","gluten","include",
                "kit","kitchen","no","noodle","pasta","peanut","plant-based","potatoe","product","rice",
                "seasoning","simply","stir-fry","thai","thailand","their","vegan","vegetarian");
        List<String> expectedAllergensTags = List.of("en:peanuts");

        assertThat(barcodeLookup.getCode().equals("0737628064502")).isTrue();
        assertThat(barcodeLookup.getProduct().getId().equals("0737628064502")).isTrue();
        assertThat(barcodeLookup.getProduct().getKeywords().containsAll(expectedKeywords)).isTrue();
        assertThat(barcodeLookup.getProduct().getAllergens().equals("en:peanuts")).isTrue();
        assertThat(barcodeLookup.getProduct().getAllergensTags().containsAll(expectedAllergensTags)).isTrue();
        assertThat(barcodeLookup.getProduct().getBrands().equals("Thai Kitchen,Simply Asia")).isTrue();
        assertThat(barcodeLookup.getProduct().getBrandOwner().equals("Simply Asia Foods, Inc.")).isTrue();
        assertThat(barcodeLookup.getProduct().getBrandOwnerImported().equals("Simply Asia Foods, Inc.")).isTrue();
        assertThat(barcodeLookup.getStatus() == 1).isTrue();
    }
}

