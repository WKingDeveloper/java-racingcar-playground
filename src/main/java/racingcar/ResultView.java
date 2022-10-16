package racingcar;

public class ResultView {

    public void showValidFalseCarName() {
        System.out.println("자동차 이름이 잘못되었습니다.");
    }

    public void showValidFalseCarsSize() {
        System.out.println("자동차 이름을 2개 이상 입력해주세요.");
    }

    public void showRoundResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.printf(car.getName() + " : ");
            for (int i = 0; i < car.getPosition(); i++) {
                System.out.printf("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void showWinnersGroup(Cars winnerGroup) {
        for (Car car : winnerGroup.getCars()) {
            System.out.print(car.getName() + ", ");
        }
        System.out.println("가 최종 우승했습니다.");
    }
}
