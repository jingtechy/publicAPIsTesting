package apitests;

import apiresources.CarsApi;
import models.cars.MakesOfCars;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    public void makesOfCarsTest() {

        MakesOfCars makesOfCars = CarsApi.getMakesOfCars();

        assertThat(makesOfCars.getCount() == 11132).isTrue();
        assertThat(makesOfCars.getMessage().equals("Response returned successfully")).isTrue();
        assertThat(makesOfCars.getSearchCriteria()).isNull();
        assertThat(makesOfCars.getResults().get(0).getMakeID() == 4877).isTrue();
        assertThat(makesOfCars.getResults().get(1).getMakeID() == 11257).isTrue();
        assertThat(makesOfCars.getResults().get(0).getMakeName().equals("1/OFF KUSTOMS, LLC")).isTrue();
        assertThat(makesOfCars.getResults().get(1).getMakeName().equals("102 IRONWORKS, INC.")).isTrue();
    }
}
