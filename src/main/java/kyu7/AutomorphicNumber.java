package kyu7;

public class AutomorphicNumber {

    public static String autoMorphic(int number) {
        int square = number * number;
        String num = String.valueOf(number);
        return String.valueOf(square).endsWith(num) ? "Automorphic" : "Not!!";
    }
}
