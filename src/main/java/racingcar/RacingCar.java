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
        /*round = inputView.setRound();
        while (round == 0) {
            try {
                round = inputView.setRound();
            } catch (Exception e) {
                round = 0;
                resultView.roundSettingFalse();
            }
        }*/

        for (int i = 0; i < round; i++) {
            cars = cars.advance();
            resultView.roundResult(cars);
        }

        Cars winnerGroup = cars.getWinnerGroup();

        resultView.result(winnerGroup);

    }
}
