package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public Cars settingCars(String string) {
        Cars cars = new Cars();
        String[] splitString = string.split(",");
        for (String name : splitString) {
            cars.addCar(new Car(name));
        }
        return cars;
    }

    private void addCar(Car car) {
        this.cars.add(car);
    }

    public boolean carsValidation() {
        if (this.cars.size()<2) {
            return false;
        }
        return true;
    }

    public Cars advance() {
        this.cars.stream().forEach(car -> car.advance());
        return this;
    }
}
