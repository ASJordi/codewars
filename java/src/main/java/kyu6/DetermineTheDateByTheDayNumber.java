package kyu6;

import java.time.LocalDate;

public class DetermineTheDateByTheDayNumber {

    public static String getDay(int day, boolean isLeap) {
        LocalDate localDate;

        if (isLeap) localDate = LocalDate.ofYearDay(2020, day);
        else localDate = LocalDate.ofYearDay(2021, day);

        String month = localDate.getMonth().toString();
        month = month.charAt(0) + month.substring(1).toLowerCase();

        return month + ", " + localDate.getDayOfMonth();
    }

}
