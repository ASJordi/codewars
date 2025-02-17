package kyu6;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HowManyWorkingDaysTest {

    @Test
    public void countTest() {
        assertEquals(20, HowManyWorkingDays.count(LocalDate.of(2017, 6, 1), LocalDate.of(2017, 6, 1)));
        assertEquals(60, HowManyWorkingDays.count(LocalDate.of(2012, 2, 1), LocalDate.of(2012, 4, 1)));
        assertEquals(280, HowManyWorkingDays.count(LocalDate.of(2078, 1, 1), LocalDate.of(2079, 1, 1)));
        assertEquals(7805, HowManyWorkingDays.count(LocalDate.of(-1000, 6, 1), LocalDate.of(-970, 4, 1)));
    }

}
