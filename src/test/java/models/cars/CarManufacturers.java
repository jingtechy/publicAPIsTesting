package models.cars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarManufacturers {
    @JsonProperty("Count")
    private int count;
    @JsonProperty("Results")
    private List<Result> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {
        @JsonProperty("Mfr_ID")
        private int mfrID;

        @JsonProperty("VehicleTypes")
        private List<VehicleType> vehicleTypes;
        public int getMfrID() {
            return mfrID;
        }

        public void setMfrID(int mfrID) {
            this.mfrID = mfrID;
        }

        public List<VehicleType> getVehicleTypes() {
            return vehicleTypes;
        }

        public void setVehicleTypes(List<VehicleType> vehicleTypes) {
            this.vehicleTypes = vehicleTypes;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class VehicleType {
            @JsonProperty("IsPrimary")
            private boolean isPrimary;
            @JsonProperty("Name")
            private String name;
            public boolean isPrimary() {
                return isPrimary;
            }

            public void setPrimary(boolean primary) {
                isPrimary = primary;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
