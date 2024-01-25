package apiresources;

import models.calendars.Calendar;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class CalendarsApi {

    public static Calendar getCalendarForTodayApi() {
        String calendarForTodayEndpoint = "http://calapi.inadiutorium.cz/api/v0/en/calendars/general-en/today";

        Calendar calendar = given()
                .header("Content-Type", "application/json")
                .when()
                .get(calendarForTodayEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .body()
                .as(Calendar.class);

        return calendar;
    }

    public static Calendar getCalendarForTomorrowApi() {
        String calendarForTomorrowEndpoint = "http://calapi.inadiutorium.cz/api/v0/en/calendars/general-en/tomorrow";

        Calendar calendar = given()
                .header("Content-Type", "application/json")
                .when()
                .get(calendarForTomorrowEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .body()
                .as(Calendar.class);

        return calendar;
    }

    public static Calendar getCalendarForYesterdayApi() {
        String calendarForYesterdayEndpoint = "http://calapi.inadiutorium.cz/api/v0/en/calendars/general-en/yesterday";

        Calendar calendar = given()
                .header("Content-Type", "application/json")
                .when()
                .get(calendarForYesterdayEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .body()
                .as(Calendar.class);

        return calendar;
    }
}
