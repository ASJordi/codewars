package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HoursToSecondsTest {

    @Test
    public void test0() {
        assertEquals(3600, HoursToSeconds.hoursToSeconds(1));
    }

}
