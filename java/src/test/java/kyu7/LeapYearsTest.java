package kyu7;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LeapYearsTest {

    @Test
    public void testYear2020() {
        assertEquals(true, LeapYears.isLeapYear(2020));
    }

    @Test
    public void testYear2000() {
        assertEquals(true, LeapYears.isLeapYear(2000));
    }

    @Test
    public void testYear2015() {
        assertEquals(false, LeapYears.isLeapYear(2015));
    }

    @Test
    public void testYear2100() {
        assertEquals(false, LeapYears.isLeapYear(2100));
    }

}
