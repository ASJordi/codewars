package kyu7;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleEviternityNumbers {

    public static int solve(int a, int b) {
        int count = 0;

        for (int i = a; i < b; i++) {
            if (isEviternityNumber(i)) count++;
        }

        return count;
    }

    public static boolean isEviternityNumber(int n) {
        ArrayList<String> validNumbers = new ArrayList<>(Arrays.asList("8", "5", "3"));
        String num = String.valueOf(n);
        int numLen = num.length();

        for (int i = 0; i < num.length(); i++) {
            String digit = Character.toString(num.charAt(i));
            if (!validNumbers.contains(digit)) return false;
        }

        int countEight = numLen - num.replace("8", "").length();
        int countFive = numLen - num.replace("5", "").length();
        int countThree = numLen - num.replace("3", "").length();

        if (countEight == 0) return false;

        return (countEight >= countFive) && (countFive >= countThree);
    }

}
