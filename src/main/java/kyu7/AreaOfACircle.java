package kyu7;

import java.math.BigDecimal;

public class AreaOfACircle {

    public static double area(double radius) {
        if (radius < 1) throw new IllegalArgumentException();
//        BigDecimal.valueOf(radius).pow(2).multiply(BigDecimal.valueOf(Math.PI)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return (Math.PI * (radius * radius));
    }

}
