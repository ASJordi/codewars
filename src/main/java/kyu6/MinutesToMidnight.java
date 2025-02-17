package kyu6;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class MinutesToMidnight {

    public String countMinutes(Date d) {
        LocalDateTime now = LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
        LocalDateTime midnight = now.toLocalDate().plusDays(1).atStartOfDay();
        long minutes = ChronoUnit.MINUTES.between(now, midnight);
        return minutes + " minute" + (minutes == 1 ? "" : "s");
    }

}
