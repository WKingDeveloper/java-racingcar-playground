package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

public class CarTest {

    Cars cars = new Cars();

    @Test
    @DisplayName("자동차 리스트 입력 받기")
    void settingCarsTest() {

        cars = cars.settingCars("qwe,asd,zxc");
        assertThat(cars.getCars().get(0))
                .usingRecursiveComparison()
                .isEqualTo(new Car("qwe"));

        assertThat(cars.getCars().get(1))
                .usingRecursiveComparison()
                .isEqualTo(new Car("asd"));

        assertThat(cars.getCars().get(2))
                .usingRecursiveComparison()
                .isEqualTo(new Car("zxc"));
    }

    @Test
    @DisplayName("자동차 리스트 검증 코드 만들기")
    void carValidationTest() {
        Cars cars1 = cars.settingCars("qwe,asd");
        Cars cars2 = cars.settingCars("qwe");
        Throwable thrown = catchThrowable(() -> {
            cars.settingCars("qwe,asdzxc");
        });
        Throwable thrown2 = catchThrowable(() -> {
            cars.settingCars(null);
        });
        assertThat(cars1.carsValidation()).isEqualTo(true);
        assertThat(cars2.carsValidation()).isEqualTo(false);
        assertThat(thrown).isInstanceOf(RuntimeException.class);
        assertThat(thrown2).isInstanceOf(RuntimeException.class);
    }

    @Test
    @DisplayName("60% 확률로 자동차 전진시키기")
    void carsAdvanceTest() {
        cars = cars.settingCars("qwe,asd,zxc");
        cars = cars.advance();
    }

    @Test
    @DisplayName("우승자 뽑기")
    void getWinnersGroupTest() {
        Cars winnerGroups = cars.getWinnerGroup();
        List<Integer> list = Arrays.asList(1, 2, 5, 4, 5);
        Integer max = Collections.max(list);
        int[] indices = IntStream.range(0, list.size())
                .filter(i -> list.get(i) == max)
                .toArray();
    }
}
