package kyu7;

public class BasicCalculator {

    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {

        return switch (operation) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            case "*" -> numberOne * numberTwo + 0.0;
            case "/" -> numberTwo == 0 ? null : numberOne / numberTwo;
            default -> null;
        };

    }

}
