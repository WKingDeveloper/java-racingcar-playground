package racingcar;

public class RacingCar {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        Cars cars = new Cars();
        boolean isCarsValidation = false;
        while (!isCarsValidation){
            String carNames = inputView.inputCarNames();
            try {
                cars = cars.setCars(carNames);
            } catch (RuntimeException e) {
                resultView.showValidFalseCarName();
                continue;
            }

            if (!cars.validCarsSize()) {
                resultView.showValidFalseCarsSize();
                continue;
            }

            isCarsValidation = true;

        }

        int round = inputView.inputNumberOfRound();

        for (int i = 0; i < round; i++) {
            cars = cars.advance();
            resultView.showRoundResult(cars);
        }

        Cars winnerGroup = cars.getWinnersGroup();

        resultView.showWinnersGroup(winnerGroup);

    }
}
