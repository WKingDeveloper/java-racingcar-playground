package racingcar;

public class ResultView {

    public void showValidFalseCarName() {
        System.out.println("자동차 이름이 잘못되었습니다.");
    }

    public void showValidFalseCarsSize() {
        System.out.println("자동차 이름을 2개 이상 입력해주세요.");
    }

    public void showRoundResult(Cars cars) {
        String message = "";
        for (Car car : cars.getCars()) {
            message += car.getName() + " : ";
            for (int i = 0; i < car.getPosition(); i++) {
                message += "-";
            }
            System.out.println(message);
            message = "";
        }
        System.out.println();
    }

    public void showWinnersGroup(Cars winnerGroup) {
        String message = "";
        for (Car car : winnerGroup.getCars()) {
            message += car.getName() + ", ";
        }
        message += "가 최종 우승했습니다.";
        message = message.replace(", 가", "가");
        System.out.println(message);
    }
}
