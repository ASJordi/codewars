package kyu6;

import java.time.LocalDate;
import java.time.temporal.WeekFields;

public class CalendarWeek {

    public static int getCalendarWeek(String dateString) {
        return LocalDate.parse(dateString).get(WeekFields.ISO.weekOfWeekBasedYear());
    }

}
