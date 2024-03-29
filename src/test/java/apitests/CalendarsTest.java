package apitests;

import apiresources.CalendarsApi;
import models.calendars.Calendar;
import models.calendars.JewishCalendar;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.assertThat;

public class CalendarsTest {

    public ZoneId utcZone = ZoneId.of("UTC");

    // Get the current date in the UTC zone
    public LocalDate currentDate = LocalDate.now(utcZone);
    public int dayOfMonth;

    public DayOfWeek dayOfWeek;

    @Test
    public void calendarForTodayApiTest() {

        Calendar calendar = CalendarsApi.getCalendarForTodayApi();

        // Get the day of the month and day of the week
        dayOfMonth = currentDate.getDayOfMonth();

        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        // Calculate the week of the month
        int weekOfMonth = (dayOfMonth - 1) / 7 + 1;

        // Adjust for the first day of the week
        if (dayOfWeek.getValue() < dayOfMonth % 7) {
            weekOfMonth++;
        }

        // Special case: adjust for the last week of the previous month
        if (weekOfMonth > 4) {
            weekOfMonth = 4;
        }

        assertThat(calendar.getDate().equals(currentDate.toString())).isTrue();
        assertThat(calendar.getSeason().equals("ordinary")).isTrue();
        assertThat(calendar.getSeasonWeek() == weekOfMonth).isTrue();
        assertThat(calendar.getWeekday().equalsIgnoreCase(dayOfWeek.toString())).isTrue();
//        assertThat(calendar.getCelebrations().get(0).getRankNum() == 3.13).isTrue();
    }

    @Test
    public void calendarForTomorrowApiTest() {

        Calendar calendar = CalendarsApi.getCalendarForTomorrowApi();

        // Get the day of the month and day of the week
        dayOfMonth = currentDate.plusDays(1).getDayOfMonth();

        DayOfWeek dayOfWeek = currentDate.plusDays(1).getDayOfWeek();

        assertThat(calendar.getDate().equals(currentDate.plusDays(1).toString())).isTrue();
        assertThat(calendar.getSeason().equals("ordinary")).isTrue();
        assertThat(calendar.getWeekday().equalsIgnoreCase(dayOfWeek.toString())).isTrue();
    }

    @Test
    public void calendarForYesterdayApiTest() {

        Calendar calendar = CalendarsApi.getCalendarForYesterdayApi();

        assertThat(calendar.getDate().equals(LocalDate.now(utcZone).plusDays(-1).toString())).isTrue();
        assertThat(calendar.getSeason().equals("ordinary")).isTrue();
//        assertThat(calendar.getCelebrations().get(0).getColour().equals("green")).isTrue();
    }

    @Test
    public void jewishCalendarApiTest() {

        JewishCalendar jewishCalendar = CalendarsApi.getJewishCalendarApi();

        assertThat(jewishCalendar.getTitle().equals("Hebcal São Paulo 2024")).isTrue();
        assertThat(jewishCalendar.getLocation().getCity().equals("São Paulo")).isTrue();
        assertThat(jewishCalendar.getItems().get(0).getMemo().equals("Parashat Shemot")).isTrue();
    }

    @Test
    public void shabbatTimesApiTest() {

        JewishCalendar jewishCalendar = CalendarsApi.getShabbatTimesApi();

        assertThat(jewishCalendar.getTitle().equals("Hebcal São Paulo February 2024")).isTrue();
        assertThat(jewishCalendar.getItems().get(1).getCategory().equals("parashat")).isTrue();
    }
}
