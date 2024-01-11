package models.cars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MakesOfCars {
    @JsonProperty("Count")
    private int count;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("SearchCriteria")
    private Integer searchCriteria;
    @JsonProperty("Results")
    private List<Makes> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(Integer searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public List<Makes> getResults() {
        return results;
    }

    public void setResults(List<Makes> results) {
        this.results = results;
    }

    public static class Makes {
        @JsonProperty("Make_ID")
        private int makeID;
        @JsonProperty("Make_Name")
        private String makeName;

        public int getMakeID() {
            return makeID;
        }

        public void setMakeID(int makeID) {
            this.makeID = makeID;
        }

        public String getMakeName() {
            return makeName;
        }

        public void setMakeName(String makeName) {
            this.makeName = makeName;
        }
    }
}
