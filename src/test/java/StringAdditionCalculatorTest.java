import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

public class StringAdditionCalculatorTest {

    StringAdditionCalculator stringAdditionCalculator = new StringAdditionCalculator();

    @Test
    @DisplayName("쉼표를 기준으로 문자열 구분하여 ArrayList로 출력")
    void splitStringToArrayTest() {
        ArrayList<Integer> result = stringAdditionCalculator.splitStringToArray("1,2,3");
        ArrayList<Integer> result2 = stringAdditionCalculator.splitStringToArray("");
        ArrayList<Integer> result3 = stringAdditionCalculator.splitStringToArray(null);
        assertThat(result).isEqualTo(Arrays.asList(1, 2, 3));
        assertThat(result2).isEqualTo(Arrays.asList(0));
        assertThat(result3).isEqualTo(Arrays.asList(0));
    }

    @Test
    @DisplayName("List 안에 있는 총합 구하기")
    void sumOfListTest() {
        int result = stringAdditionCalculator.sumOfList(Arrays.asList(1, 2, 3));
        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("String validation")
    void stringValidationTest() {
        boolean result1 = stringAdditionCalculator.stringValidation("1");
        Throwable thrown = catchThrowable(() -> {
            stringAdditionCalculator.stringValidation("-2");
        });
        Throwable thrown2 = catchThrowable(() -> {
            stringAdditionCalculator.stringValidation("a");
        });
        assertThat(result1).isEqualTo(true);
        assertThat(thrown).isInstanceOf(RuntimeException.class);
        assertThat(thrown2).isInstanceOf(RuntimeException.class);
    }

    @Test
    @DisplayName("custom 구분자 만들기")
    void customDivisionTest() {
        String result = stringAdditionCalculator.customDivision("//;\n1;2;3");
        assertThat(result).isEqualTo(";");
    }
}
