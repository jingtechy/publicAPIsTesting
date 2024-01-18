package apiresources;

import models.calendars.CalendarForToday;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class CalendarsApi {

    public static CalendarForToday getCalendarForToday() {
        String calendarForTodayEndpoint = "http://calapi.inadiutorium.cz/api/v0/en/calendars/general-en/today";

        CalendarForToday calendarForToday = given()
                .header("Content-Type", "application/json")
                .when()
                .get(calendarForTodayEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .body()
                .as(CalendarForToday.class);

        return  calendarForToday;
    }
}
