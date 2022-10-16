package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public Cars setCars(String string) {
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

    public boolean validCarsSize() {
        if (this.cars.size()<2) {
            return false;
        }
        return true;
    }

    public Cars advance() {
        for (Car car : this.cars) {
            car.advance(Utils.getRandomNumberBetweenOneAndNine());
        }
        return this;
    }

    public Cars getWinnersGroup() {
        Cars winners = new Cars();
        List<Integer> positions = new ArrayList<>();
        cars.stream().forEach(car -> positions.add(car.getPosition()));
        int max = Collections.max(positions);

        int[] indices = IntStream.range(0, positions.size())
                .filter(i -> positions.get(i) == max)
                .toArray();

        for (int index : indices) {
            winners.addCar(this.cars.get(index));
        }

        return winners;
    }
}
