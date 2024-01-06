package models.animals;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BarcodeLookup {
    private String code;
    private Product product;
    private int status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Product {
        @JsonProperty("_id")
        private String id;
        @JsonProperty("_keywords")
        private List<String> keywords;
        private String allergens;
        @JsonProperty("allergens_tags")
        private List<String> allergensTags;
        @JsonProperty("brand_owner")
        private String brandOwner;
        @JsonProperty("brand_owner_imported")
        private String brandOwnerImported;
        @JsonProperty("brands_tags")
        private List<String> brandsTags;
        private String brands;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<String> getKeywords() {
            return keywords;
        }

        public void setKeywords(List<String> keywords) {
            this.keywords = keywords;
        }

        public String getAllergens() {
            return allergens;
        }

        public void setAllergens(String allergens) {
            this.allergens = allergens;
        }

        public List<String> getAllergensTags() {
            return allergensTags;
        }

        public void setAllergensTags(List<String> allergensTags) {
            this.allergensTags = allergensTags;
        }

        public String getBrandOwner() {
            return brandOwner;
        }

        public void setBrandOwner(String brandOwner) {
            this.brandOwner = brandOwner;
        }

        public String getBrandOwnerImported() {
            return brandOwnerImported;
        }

        public void setBrandOwnerImported(String brandOwnerImported) {
            this.brandOwnerImported = brandOwnerImported;
        }

        public String getBrands() {
            return brands;
        }

        public void setBrands(String brands) {
            this.brands = brands;
        }

        public List<String> getBrandsTags() {
            return brandsTags;
        }

        public void setBrandsTags(List<String> brandsTags) {
            this.brandsTags = brandsTags;
        }
    }
}
