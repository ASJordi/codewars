package easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DayOfWeekTest {

    @Test
    public void dayOfTheWeekIsSunday() {
        assertEquals("Sunday",DayOfWeek.getDay(1));
    }

    @Test
    public void dayOfTheWeekIsMonday() {
        assertEquals("Monday",DayOfWeek.getDay(2));
    }

    @Test
    public void dayOfTheWeekIsTuesday() {
        assertEquals("Tuesday",DayOfWeek.getDay(3));
    }

    @Test
    public void dayOfTheWeekIsWrong() {
        assertEquals("Wrong, please enter a number between 1 and 7",DayOfWeek.getDay(8));
        assertEquals("Wrong, please enter a number between 1 and 7",DayOfWeek.getDay(20));
    }

}
