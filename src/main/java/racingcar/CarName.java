package racingcar;

public class CarName {
    private String name;

    CarName(String name) {
        if (1 > name.length() || name.length() > 5) {
            throw new RuntimeException("자동차 이름은 1글자에서 5글자 사이로 입력가능합니다.");
        }
        if (name == null) {
            throw new RuntimeException("자동차 이름은 null일 수 없습니다.");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

}
