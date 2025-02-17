package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HoursToSecondsTest {

    @Test
    public void test0() {
        assertEquals(3600, HoursToSeconds.hoursToSeconds(1));
    }

}
