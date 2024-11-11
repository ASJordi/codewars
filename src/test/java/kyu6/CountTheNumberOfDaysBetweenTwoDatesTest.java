package kyu6;

import kyu6.CountTheNumberOfDaysBetweenTwoDates;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountTheNumberOfDaysBetweenTwoDatesTest {

    @Test
    public void getDaysAlive() throws Exception {

        assertEquals(5021, CountTheNumberOfDaysBetweenTwoDates.getDaysAlive(1987, 1, 16, 2000, 10, 15));
        assertEquals(4179, CountTheNumberOfDaysBetweenTwoDates.getDaysAlive(2005, 10, 27, 2017, 4, 6));
        assertEquals(3832, CountTheNumberOfDaysBetweenTwoDates.getDaysAlive(1998, 1, 10, 2008, 7, 8));

    }

}
