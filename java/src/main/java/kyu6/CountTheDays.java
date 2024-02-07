package kyu6;

import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CountTheDays {

    public String countDays(Date d){
        Date now = new Date();
        long days = ChronoUnit.DAYS.between(now.toInstant(), d.toInstant());
        return days < 0 ? "The day is in the past!" : days == 0 ? "Today is the day!" : days + " days";
    }

}
