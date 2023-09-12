package kyu8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LocalizeTheBarycenterOfATriangle {

    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double x0 = (x[0] + y[0] + z[0]) / 3;
        double y0 = (x[1] + y[1] + z[1]) / 3;

        return new double[]{BigDecimal.valueOf(x0).setScale(4, RoundingMode.HALF_UP).doubleValue(), BigDecimal.valueOf(y0).setScale(4, RoundingMode.HALF_UP).doubleValue()};
    }

}
