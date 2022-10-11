package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public boolean carsValidation() {
        if (this.cars.stream().findAny().filter(car -> !car.getName().carNameValidation()).isPresent()){
            return false;
        }
        if (this.cars.size()<2) {
            return false;
        }
        return true;
    }
}
