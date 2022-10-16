package racingcar;

import java.util.Random;

public class Utils {

    public static int getRandomNumberBetweenOneAndNine() {
        Random random = new Random();
        return random.nextInt(10);
    }

}
