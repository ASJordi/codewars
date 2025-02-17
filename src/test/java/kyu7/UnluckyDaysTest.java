package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnluckyDaysTest {

    @Test
    public void testSomething() {
        assertEquals(3, UnluckyDays.unluckyDays(2015));
        assertEquals(1, UnluckyDays.unluckyDays(1986));
    }

}
