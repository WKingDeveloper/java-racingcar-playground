import jdk.internal.joptsimple.internal.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringAdditionCalculator {
    public ArrayList<Integer> splitStringToArray(String s) {
        ArrayList<Integer> result = new ArrayList<>();
        if (s == null || s.length() < 1) {
            result.add(0);
            return result;
        }
        String[] splitStrings = s.split(",");
        for (String splitString : splitStrings) {
            result.add(Integer.valueOf(splitString));
        }
        return result;

    }

    public int sumOfList(List<Integer> asList) {
        return asList.stream().mapToInt(Integer::intValue).sum();
    }

    public boolean stringValidation(String string){
        int stringToInteger = Integer.valueOf(string);
        if (stringToInteger < 0) {
            throw new RuntimeException();
        }
        return true;
    }

    public String customDivision(String s) {
        return String.valueOf(s.charAt(s.indexOf("\n")-1));
    }
}
