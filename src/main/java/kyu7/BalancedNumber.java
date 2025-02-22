package kyu7;

public class BalancedNumber {

    public static String balancedNum(long number) {
        if (number < 99) return "Balanced";

        String str = String.valueOf(number);
        int mid = str.length() / 2;
        long left;
        long right;

        if (str.length() % 2 != 0) left = str.substring(0, mid).chars().mapToLong(Character::getNumericValue).sum();
        else left = str.substring(0, mid - 1).chars().mapToLong(Character::getNumericValue).sum();
        right = str.substring(mid + 1).chars().mapToLong(Character::getNumericValue).sum();

        return left == right ? "Balanced" : "Not Balanced";
    }

}
