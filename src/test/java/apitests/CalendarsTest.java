package apitests;

import apiresources.CalendarsApi;
import models.calendars.Calendar;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.assertThat;

public class CalendarsTest {

    @Test
    public void calendarForTodayApiTest() {

        Calendar calendar = CalendarsApi.getCalendarForTodayApi();

        ZoneId utcZone = ZoneId.of("UTC");

        assertThat(calendar.getDate().equals(LocalDate.now(utcZone).toString())).isTrue();
        assertThat(calendar.getSeason().equals("ordinary")).isTrue();
//        assertThat(calendar.getSeasonWeek() == 2).isTrue();
        assertThat(calendar.getCelebrations().get(0).getRank().equals("ferial")).isTrue();
        assertThat(calendar.getCelebrations().get(0).getRankNum() == 3.13).isTrue();
    }

    @Test
    public void calendarForTomorrowApiTest() {

        Calendar calendar = CalendarsApi.getCalendarForTomorrowApi();

        ZoneId utcZone = ZoneId.of("UTC");

        assertThat(calendar.getDate().equals(LocalDate.now(utcZone).plusDays(1).toString())).isTrue();
        assertThat(calendar.getSeason().equals("ordinary")).isTrue();
        assertThat(calendar.getCelebrations().get(0).getRank().equals("ferial")).isTrue();
    }

    @Test
    public void calendarForYesterdayApiTest() {

        Calendar calendar = CalendarsApi.getCalendarForYesterdayApi();

        ZoneId utcZone = ZoneId.of("UTC");

        assertThat(calendar.getDate().equals(LocalDate.now(utcZone).plusDays(-1).toString())).isTrue();
        assertThat(calendar.getSeason().equals("ordinary")).isTrue();
        assertThat(calendar.getCelebrations().get(0).getColour().equals("green")).isTrue();
    }
}
