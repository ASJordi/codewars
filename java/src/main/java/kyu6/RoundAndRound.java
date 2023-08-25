package kyu6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundAndRound {

    public static double roundTo2DecimalPlaces(double number) {
        BigDecimal num = BigDecimal.valueOf(number);
        num = num.setScale(2, RoundingMode.HALF_UP);
        return num.doubleValue();
//        return BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

}
