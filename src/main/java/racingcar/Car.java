package racingcar;

import java.util.Random;

public class Car {

    private CarPosition position;
    private CarName name;

    public Car(String name) {
        this.position = new CarPosition();
        this.name = new CarName(name);
    }

    public int getPosition() {
        return position.getPosition();
    }

    public String getName() {
        return name.getName();
    }


    public void advance(int num) {
        if(randomPassThrough(num)){
            this.position.add();
        }
    }

    private boolean randomPassThrough(int randomNumber) {
        if (randomNumber < 4) {
            return false;
        }
        return true;
    }
}
