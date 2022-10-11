package racingcar;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public String start() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String value = scanner.nextLine();
        return value;
    }

    public Integer setRound() {
        System.out.println("시도할 회수는 몇회인가요?");
        return Integer.valueOf(scanner.nextLine());
    }
}
