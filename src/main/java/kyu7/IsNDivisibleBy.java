package kyu7;

public class IsNDivisibleBy {

    public static boolean isDivisible(int... numbers) {
        for (int num : numbers) if (numbers[0] % num != 0) return false;
        return true;
    }

}
