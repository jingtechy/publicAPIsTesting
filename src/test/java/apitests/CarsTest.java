package apitests;

import apiresources.CarsApi;
import models.cars.CarManufacturers;
import models.cars.MakesOfCars;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    public void makesOfCarsTest() {

        MakesOfCars makesOfCars = CarsApi.getMakesOfCarsApi();

        assertThat(makesOfCars.getMessage().equals("Response returned successfully")).isTrue();
        assertThat(makesOfCars.getSearchCriteria()).isNull();
        assertThat(makesOfCars.getResults().get(0).getMakeID() == 4877).isTrue();
        assertThat(makesOfCars.getResults().get(1).getMakeID() == 11257).isTrue();
        assertThat(makesOfCars.getResults().get(0).getMakeName().equals("1/OFF KUSTOMS, LLC")).isTrue();
        assertThat(makesOfCars.getResults().get(1).getMakeName().equals("102 IRONWORKS, INC.")).isTrue();
    }

    @Test
    public void carManufacturersTest() {

        CarManufacturers carManufacturers = CarsApi.getCarManufacturersApi();

//        assertThat(carManufacturers.getCount() == 87).isTrue();
        assertThat(carManufacturers.getResults().get(0).getMfrID() == 955).isTrue();
        assertThat(carManufacturers.getResults().get(0).getVehicleTypes().get(0).isPrimary()).isTrue();
        assertThat(carManufacturers.getResults().get(0).getVehicleTypes().get(1).isPrimary()).isFalse();
        assertThat(carManufacturers.getResults().get(1).getVehicleTypes().get(0).getName().equals("Passenger Car")).isTrue();
        assertThat(carManufacturers.getResults().get(1).getVehicleTypes().get(1).getName().equals("Multipurpose Passenger Vehicle (MPV)")).isTrue();
    }
}
