package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ExtendedWeekendsTest {

    @Test
    public void basicTests(){
        assertArrayEquals(new String[]{"JANUARY","MAY","5"}, ExtendedWeekends.solve(2016,2020));
        assertArrayEquals(new String[]{"MARCH", "DECEMBER","51"}, ExtendedWeekends.solve(1900,1950));
        assertArrayEquals(new String[]{"AUGUST", "OCTOBER","702"}, ExtendedWeekends.solve(1800,2500));
    }

}
