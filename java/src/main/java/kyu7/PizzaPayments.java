package kyu7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PizzaPayments {

    public static double michaelPays(double cost) {
        double desc = cost / 3;
        if (cost < 5) desc = 0;
        if (desc > 10) desc = 10;
        BigDecimal bd = BigDecimal.valueOf(cost - desc);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
