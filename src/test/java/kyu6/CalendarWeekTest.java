package kyu6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalendarWeekTest {

    @Test
    void exampleTests() {
        assertEquals(52, CalendarWeek.getCalendarWeek("2017-01-01"));
        assertEquals(52, CalendarWeek.getCalendarWeek("2018-12-24"));
        assertEquals(1, CalendarWeek.getCalendarWeek("2018-12-31"));
        assertEquals(1, CalendarWeek.getCalendarWeek("2019-01-01"));
        assertEquals(9, CalendarWeek.getCalendarWeek("2016-02-29"));
        assertEquals(53, CalendarWeek.getCalendarWeek("2015-12-29"));
    }

}
