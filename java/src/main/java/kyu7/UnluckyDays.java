package kyu7;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class UnluckyDays {

    public static int unluckyDays(int year) {
        int numOfFridays = 0;

        for (int i = 1; i < 13; i++) {
            LocalDate date = LocalDate.of(year,i,13);
            if (date.getDayOfWeek().compareTo(DayOfWeek.FRIDAY) == 0) numOfFridays++;
        }

        return numOfFridays;
    }

}
