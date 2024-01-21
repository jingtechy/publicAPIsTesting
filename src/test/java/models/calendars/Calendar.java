package models.calendars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Calendar {
    private String date;
    private String season;
    @JsonProperty("season_week")
    private int seasonWeek;
    private List<Celebrations> celebrations;
    private String weekday;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getSeasonWeek() {
        return seasonWeek;
    }

    public void setSeasonWeek(int seasonWeek) {
        this.seasonWeek = seasonWeek;
    }

    public List<Celebrations> getCelebrations() {
        return celebrations;
    }

    public void setCelebrations(List<Celebrations> celebrations) {
        this.celebrations = celebrations;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Celebrations {
        private String title;
        private String colour;
        private String rank;
        @JsonProperty("rank_num")
        private double rankNum;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public double getRankNum() {
            return rankNum;
        }

        public void setRankNum(double rankNum) {
            this.rankNum = rankNum;
        }
    }
}
