package racingcar;

public class Car {

    private CarPosition position;
    private CarName name;

    public Car() {

    }

    public Car(String name) {
        this.name = new CarName(name);
    }

    public CarName getName() {
        return name;
    }

    public Cars settingCars(String string) {
        Cars cars = new Cars();
        String[] splitString = string.split(",");
        for (String name : splitString) {
            cars.addCar(new Car(name));
        }
        return cars;
    }
}
