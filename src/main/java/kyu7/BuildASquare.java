package kyu7;

public class BuildASquare {

    public static final String generateShape(int n) {
        String symbol = "+";
        StringBuilder square = new StringBuilder();
        for (int i = 0; i < n; i++) square.append(symbol.repeat(n)).append("\n");
        return square.toString().trim();
//        return ("+".repeat(n) + "\n").repeat(n).trim();
    }

}
