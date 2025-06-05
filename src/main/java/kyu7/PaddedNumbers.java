package kyu7;

public class PaddedNumbers {

    public static String solution(int value) {
        return "Value is " + "0".repeat(5 - String.valueOf(value).length()) + value;
    }

}
