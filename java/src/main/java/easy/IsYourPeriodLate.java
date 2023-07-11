package easy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class IsYourPeriodLate {

    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {

        return ChronoUnit.DAYS.between(last, today) > cycleLength;
        
    }

}
