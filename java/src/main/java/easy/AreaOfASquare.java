package easy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AreaOfASquare {

    public static double squareArea(double A){

        double l = (A * 4) / (2 * Math.PI);

        double area = l * l;

        BigDecimal roundedArea = BigDecimal.valueOf(area).setScale(2, RoundingMode.HALF_UP);

        return roundedArea.doubleValue();

    }

}
