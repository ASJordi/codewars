package kyu7;

public class TwoNumbersArePositive {

    public static boolean twoArePositive(int a, int b, int c) {
        int positiveNumbers = 0;
        if (a > 0) positiveNumbers++;
        if (b > 0) positiveNumbers++;
        if (c > 0) positiveNumbers++;
        return positiveNumbers == 2;
    }

}
