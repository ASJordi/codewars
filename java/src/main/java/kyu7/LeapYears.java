package kyu7;

import java.time.Year;

public class LeapYears {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) return true;
        return false;
//        return Year.isLeap(year);
    }

}
