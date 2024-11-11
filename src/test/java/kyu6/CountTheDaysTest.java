package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Date;
import java.util.Random;

public class CountTheDaysTest {

    @Test
    public void standardTests() {
        CountTheDays d = new CountTheDays();
        assertEquals("The day is in the past!", d.countDays(new Date(2000-1900,12,24))); //year 2000
        assertEquals("Today is the day!", d.countDays(new Date()));
    }

}
