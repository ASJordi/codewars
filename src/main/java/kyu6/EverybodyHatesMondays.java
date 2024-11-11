package kyu6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import static java.time.Period.ofWeeks;

public class EverybodyHatesMondays {

    static long count(LocalDate birthday, LocalDate today) {
        birthday = birthday.plusYears(22);

        if (birthday.isAfter(today)) return 0;

        var nextMonday = birthday.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        birthday = birthday.plusYears(56);

        return nextMonday.datesUntil(birthday.isBefore(today) ? birthday : today.plusDays(1), ofWeeks(1)).count();
    }

}
