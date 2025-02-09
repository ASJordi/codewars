package kyu7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;

public class ExtendedWeekends {

    public static String [] solve(int a, int b){
        int n = b - a;
        int year = a;
        List<String> months = new LinkedList<>();

        for (int i = 0; i <= n; i++) {

            for (int j = 1; j <= 12 ; j++) {
                var date = LocalDate.of(year, j, 1);

                if (DayOfWeek.FRIDAY.equals(date.getDayOfWeek()) && ChronoUnit.DAYS.between(date, date.plusMonths(1)) == 31) {
                    months.add(date.getMonth().toString());
                }
            }

            year++;
        }

        return new String[]{months.get(0), months.get(months.size() - 1), String.valueOf(months.size())};
    }

}
