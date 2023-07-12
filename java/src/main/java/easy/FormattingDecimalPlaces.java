package easy;

import java.text.DecimalFormat;

public class FormattingDecimalPlaces {

    public static double TwoDecimalPlaces(double number) {

        DecimalFormat df = new DecimalFormat("0.00");

        return Double.parseDouble(df.format(number));

    }

}
