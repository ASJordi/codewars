package kyu7;

import java.util.Arrays;

public class BasicMathAddOrSubtract {

    public static String calculate(String str) {
        return "" + Arrays.stream(str.replace("minus", "plus-").split("plus"))
                .mapToInt(Integer::parseInt)
                .sum();
    }

}
