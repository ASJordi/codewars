package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SeeYouNextHappyYearTest {

    @Test
    public void Check_Basic_Values() {
        assertEquals(1023, SeeYouNextHappyYear.nextHappyYear(1001));
        assertEquals(1203, SeeYouNextHappyYear.nextHappyYear(1123));
        assertEquals(2013, SeeYouNextHappyYear.nextHappyYear(2001));
        assertEquals(2340, SeeYouNextHappyYear.nextHappyYear(2334));
        assertEquals(3401, SeeYouNextHappyYear.nextHappyYear(3331));
        assertEquals(2345, SeeYouNextHappyYear.nextHappyYear(2342));
        assertEquals(2013, SeeYouNextHappyYear.nextHappyYear(1987));
        assertEquals(2014, SeeYouNextHappyYear.nextHappyYear(2013));
        assertEquals(3012, SeeYouNextHappyYear.nextHappyYear(3000));
    }

    @Test
    public void Check_Larger_Values() {
        assertEquals(5601, SeeYouNextHappyYear.nextHappyYear(5555));
        assertEquals(7801, SeeYouNextHappyYear.nextHappyYear(7712));
        assertEquals(8091, SeeYouNextHappyYear.nextHappyYear(8088));
        assertEquals(8901, SeeYouNextHappyYear.nextHappyYear(8800));
        assertEquals(9012, SeeYouNextHappyYear.nextHappyYear(8989));
        assertEquals(9012, SeeYouNextHappyYear.nextHappyYear(8977));
        assertEquals(6870, SeeYouNextHappyYear.nextHappyYear(6869));
        assertEquals(9012, SeeYouNextHappyYear.nextHappyYear(8999));
    }

}
