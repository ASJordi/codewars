package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayOfTheYearTest {

    @Test
    public void ExampleTests() {
        assertEquals("Normal Day", 145, DayOfTheYear.toDayOfYear(new int[]{25,  5, 2022}));
        assertEquals("Normal day", 137, DayOfTheYear.toDayOfYear(new int[]{17,  5, 1991}));
        assertEquals("Normal day", 295, DayOfTheYear.toDayOfYear(new int[]{22, 10, 1990}));
        assertEquals("First day, normal year", 1, DayOfTheYear.toDayOfYear(new int[]{ 1,  1, 2001}));
        assertEquals("First day, leap year", 1, DayOfTheYear.toDayOfYear(new int[]{ 1,  1, 2000}));
        assertEquals("Last day, normal year", 365, DayOfTheYear.toDayOfYear(new int[]{31, 12, 2003}));
        assertEquals("Last day, leap year", 366, DayOfTheYear.toDayOfYear(new int[]{31, 12, 2004}));
        assertEquals ("Leap day", 60, DayOfTheYear.toDayOfYear(new int[]{29,  2, 2008}));
    }
    
}
