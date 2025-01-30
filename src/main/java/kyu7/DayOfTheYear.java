package kyu7;

import java.time.LocalDate;

public class DayOfTheYear {

    public static int toDayOfYear(int[] date){
        return LocalDate.of(date[2], date[1], date[0]).getDayOfYear();
    }

}
