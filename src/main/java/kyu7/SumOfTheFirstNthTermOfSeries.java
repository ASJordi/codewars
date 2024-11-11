package kyu7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SumOfTheFirstNthTermOfSeries {

    public static String seriesSum(int n) {
        double sum = 0.0;

        for (int i = 0; i < n; i++) sum += 1.0 / (1 + 3 * i);

        return BigDecimal.valueOf(sum).setScale(2, RoundingMode.HALF_UP).toString();
    }

}
