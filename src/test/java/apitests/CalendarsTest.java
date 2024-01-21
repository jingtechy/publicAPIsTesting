package apitests;

import apiresources.CalendarsApi;
import models.calendars.Calendar;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.assertThat;

public class CalendarsTest {

    @Test
    public void calendarsForTodayApiTest() {

        Calendar calendar = CalendarsApi.getCalendarForToday();

        ZoneId nzZoneId = ZoneId.of("UTC");

        assertThat(calendar.getDate().equals(LocalDate.now(nzZoneId).toString())).isTrue();
        assertThat(calendar.getSeason().equals("ordinary")).isTrue();
//        assertThat(calendar.getSeasonWeek() == 2).isTrue();
        assertThat(calendar.getCelebrations().get(0).getRank().equals("ferial")).isTrue();
        assertThat(calendar.getCelebrations().get(0).getRankNum() == 3.13).isTrue();
    }

    @Test
    public void calendarsForTomorrowApiTest() {

        Calendar calendar = CalendarsApi.getCalendarForTomorrow();

        ZoneId nzZoneId = ZoneId.of("UTC");

        assertThat(calendar.getDate().equals(LocalDate.now(nzZoneId).plusDays(1).toString())).isTrue();
        assertThat(calendar.getSeason().equals("ordinary")).isTrue();
        assertThat(calendar.getCelebrations().get(0).getRank().equals("ferial")).isTrue();
        assertThat(calendar.getCelebrations().get(1).getRankNum() == 3.12).isTrue();
    }
}
