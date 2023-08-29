package kyu7;

public class FormattingDecimalPlacesOne {

    public static double twoDecimalPlaces(double number) {
        String num = String.valueOf(number);
        return Double.parseDouble(num.substring(0, num.lastIndexOf('.') + 3));
    }

}
