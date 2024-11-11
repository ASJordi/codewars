package kyu6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CountTheNumberOfDaysBetweenTwoDates {


    public static void main(String[] args) {

    }

    public static long getDaysAlive(int year, int month, int day, int year2, int month2, int day2) {
        LocalDate first = LocalDate.of(year, month, day);
        LocalDate second = LocalDate.of(year2, month2, day2);
        return ChronoUnit.DAYS.between(first, second);
    }

}
