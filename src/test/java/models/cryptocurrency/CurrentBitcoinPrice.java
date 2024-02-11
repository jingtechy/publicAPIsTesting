package models.cryptocurrency;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentBitcoinPrice {

    private Time time;
    private String disclaimer;
    private String chartName;
    private BPI bpi;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public BPI getBpi() {
        return bpi;
    }

    public void setBpi(BPI bpi) {
        this.bpi = bpi;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Time {
        private String updated;

        public String getUpdated() {
            return updated;
        }

        public void setUpdated(String updated) {
            this.updated = updated;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BPI {
        @JsonProperty("USD")
        private USD usd;
        @JsonProperty("GBP")
        private GBP gbp;
        @JsonProperty("EUR")
        private EUR eur;

        public USD getUsd() {
            return usd;
        }

        public void setUsd(USD usd) {
            this.usd = usd;
        }

        public GBP getGbp() {
            return gbp;
        }

        public void setGbp(GBP gbp) {
            this.gbp = gbp;
        }

        public EUR getEur() {
            return eur;
        }

        public void setEur(EUR eur) {
            this.eur = eur;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class USD {
            private String code;

            private String description;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class GBP {

            private String code;

            private String description;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class EUR {

            private String code;

            private String description;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }
    }
}