package racingcar;

import java.util.Random;

public class Car {

    private CarPosition position;
    private CarName name;

    public Car() {

    }

    public Car(String name) {
        this.position = new CarPosition();
        this.name = new CarName(name);
    }

    public int getPosition() {
        return position.getPosition();
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

    public void advance() {
        if(randomPassThrough()){
            this.position.add();
        }
    }

    private boolean randomPassThrough() {
        Random random = new Random();
        int num = random.nextInt(10);
        if (num < 4) {
            return false;
        }
        return true;
    }
}
