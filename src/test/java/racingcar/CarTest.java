package racingcar;

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

    @Test
    @DisplayName("자동차 리스트 검증 코드 만들기")
    void carValidationTest() {
        Cars cars1 = car.settingCars("qwe,asd,zxc");
        Cars cars2 = car.settingCars("qwe");
        Cars cars3 = car.settingCars("qwe,asdzxc");
        assertThat(cars1.carsValidation()).isEqualTo(true);
        assertThat(cars2.carsValidation()).isEqualTo(false);
        assertThat(cars3.carsValidation()).isEqualTo(false);
    }

    @Test
    @DisplayName("60% 확률로 자동차 전진시키기")
    void carsAdvanceTest() {
        Cars cars = car.settingCars("qwe,asd,zxc");
        cars = cars.advance();
    }
}
