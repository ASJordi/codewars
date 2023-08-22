package kyu7;

public class MakeAFunctionThatDoesArithmetic {

    public static int arithmetic(int a, int b, String operator) {
        return switch (operator) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide" -> a / b;
            default -> 0;
        };
    }

}
