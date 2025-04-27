package kyu8;

public class SimpleCalculator {

    public static double calculate(double a, double b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed");
                }
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + op);
        };
    }

}
