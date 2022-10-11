package racingcar;

public class CarName {
    private String name;

    CarName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean carNameValidation() {
        if (1 > this.name.length() || this.name.length() > 5) {
            return false;
        }
        if (this.name == null) {
            return false;
        }
        return true;
    }

}
