package kyu7;

public class ConsecutiveDigitsToFormSum {

    public static boolean consecutiveDucks(int n) {
        return (n & (n - 1)) != 0;
    }

}
