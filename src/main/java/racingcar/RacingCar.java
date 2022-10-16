package racingcar;

public class RacingCar {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        Cars cars = new Cars();
        boolean isCarsValidation = false;
        while (!isCarsValidation){
            String carNames = inputView.start();
            try {
                cars = cars.settingCars(carNames);
            } catch (RuntimeException e) {
                resultView.carNameMismatch();
                continue;
            }

            isCarsValidation = cars.carsValidation();
            resultView.lackOfCarNumbers();
        }

        int round = inputView.setRound();

        for (int i = 0; i < round; i++) {
            cars = cars.advance();
            resultView.roundResult(cars);
        }

        Cars winnerGroup = cars.getWinnerGroup();

        resultView.result(winnerGroup);

    }
}
