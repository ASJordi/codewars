package kyu7;

import java.time.LocalDate;

public class TargetDate {

    public static String dateNbDays(double a0, double a, double p) {

        double dailyRate = p / 36000;

        int days = 0;
        double currentAmount = a0;

        while (currentAmount < a) {
            currentAmount += currentAmount * dailyRate;
            days++;
        }

        LocalDate startDate = LocalDate.of(2016, 1, 1);
        LocalDate finalDate = startDate.plusDays(days);

        return finalDate.toString();

    }
}