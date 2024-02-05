package apitests;

import apiresources.ComicsApi;
import models.comics.XKCD;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ComicsTest {

    @Test
    public void xkcdComicTest() {

        XKCD xkcd = ComicsApi.getXKCDComicApi();

        assertThat(xkcd.getSafeTitle().equals("Greenhouse Effect")).isTrue();
        assertThat(xkcd.getImg().equals("https://imgs.xkcd.com/comics/greenhouse_effect.png")).isTrue();
    }
}