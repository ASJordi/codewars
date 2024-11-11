package kyu7;

public class DebugSumOfDigitsOfANumber {

    public static int sumOfDigits(int n) {
        String[] digits = String.valueOf(n).split("");
        int sum = 0;

        for (String d : digits) sum += Integer.parseInt(d);

        return sum;
    }

}
