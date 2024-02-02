package apiresources;

import models.calendars.Calendar;
import models.calendars.JewishCalendar;

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

    public static JewishCalendar getJewishCalendarApi() {
        String jewishCalendarEndpoint = "https://www.hebcal.com/hebcal/?v=1&cfg=json&maj=on&min=on&mod=on&nx=on&year=now&month=x&ss=on&mf=on&c=on&geo=geoname&geonameid=3448439&m=50&s=on";

        JewishCalendar jewishCalendar = given()
                .header("Content-Type", "application/json")
                .when()
                .get(jewishCalendarEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .body()
                .as(JewishCalendar.class);

        return jewishCalendar;
    }

    public static JewishCalendar getShabbatTimesApi() {
        String shabbatTimesEndpoint = "https://www.hebcal.com/shabbat/?cfg=json&geonameid=3448439&m=50";

        JewishCalendar jewishCalendar = given()
                .header("Content-Type", "application/json")
                .when()
                .get(shabbatTimesEndpoint)
                .then()
                .statusCode(equalTo(200))
                .extract()
                .body()
                .as(JewishCalendar.class);

        return  jewishCalendar;
    }
}
