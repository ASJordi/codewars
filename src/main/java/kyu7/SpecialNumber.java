package kyu7;

import java.util.ArrayList;
import java.util.Arrays;

public class SpecialNumber {

    public static String specialNumber(int number) {
        ArrayList<Integer> specialNumbers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        String[] digits = String.valueOf(number).split("");

        for (String d : digits) {
            if (!specialNumbers.contains(Integer.parseInt(d))) return "NOT!!";
        }

        return "Special!!";
    }

}
