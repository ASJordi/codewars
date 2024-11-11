package kyu7;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class AgeIndays {

    public static String ageInDays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        long daysBetween = DAYS.between(birthday, today);
        return "You are " + daysBetween +" days old";
    }

}
