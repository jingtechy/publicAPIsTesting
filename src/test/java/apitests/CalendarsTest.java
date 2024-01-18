package apitests;

import apiresources.CalendarsApi;
import models.calendars.CalendarForToday;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.assertThat;

public class CalendarsTest {

    @Test
    public void calendarsForTodayApiTest() {

        CalendarForToday calendarForToday = CalendarsApi.getCalendarForToday();

        ZoneId nzZoneId = ZoneId.of("UTC");

        assertThat(calendarForToday.getDate().equals(LocalDate.now(nzZoneId).toString())).isTrue();
        assertThat(calendarForToday.getSeason().equals("ordinary")).isTrue();
        assertThat(calendarForToday.getSeasonWeek() == 2).isTrue();
        assertThat(calendarForToday.getCelebrations().get(0).getRank().equals("ferial")).isTrue();
        assertThat(calendarForToday.getCelebrations().get(0).getRankNum() == 3.13).isTrue();
    }
}
