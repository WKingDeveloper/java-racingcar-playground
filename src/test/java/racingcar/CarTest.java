package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    Car car = new Car();

    @Test
    @DisplayName("자동차 리스트 입력 받기")
    void settingCarsTest() {
        Cars cars = car.settingCars("qwe,asd,zxc");
        Cars predictCars = new Cars();
        predictCars.addCar(new Car("qwe"));
        predictCars.addCar(new Car("asd"));
        predictCars.addCar(new Car("zxc"));
        assertThat(cars)
                .usingRecursiveComparison()
                .isEqualTo(predictCars);
    }
}
