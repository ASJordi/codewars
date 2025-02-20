package kyu7;

public class BinaryCalculator {

    public static String calculate(final String n1, final String n2, final String o) {
        int a = Integer.parseInt(n1, 2);
        int b = Integer.parseInt(n2, 2);

        return switch (o) {
            case "add" -> Integer.toBinaryString(a + b);
            case "subtract" -> Integer.toBinaryString(a - b);
            case "multiply" -> Integer.toBinaryString(a * b);
            default -> "0";
        };
    }

}
