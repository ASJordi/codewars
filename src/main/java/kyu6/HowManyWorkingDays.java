package kyu6;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.MONDAY;
import static java.time.temporal.ChronoUnit.WEEKS;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

public class HowManyWorkingDays {

    static long count(final LocalDate start, final LocalDate end) {
        LocalDate firstMonday = start.with(nextOrSame(MONDAY));
        LocalDate lastFriday = end.with(TemporalAdjusters.lastInMonth(FRIDAY));
        return 5 * (WEEKS.between(firstMonday, lastFriday) + 1);
    }

//    static long count(final LocalDate start, final LocalDate end) {
//        var firstMonday = start.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
//        var lastFriday = end.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
//
//        final Set<DayOfWeek> businessDays = Set.of(
//                MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
//        );
//
//        return firstMonday.datesUntil(lastFriday)
//                .filter(d -> businessDays.contains(d.getDayOfWeek()))
//                .count() + 1;
//    }

}
