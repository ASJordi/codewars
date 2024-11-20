package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTheNumberTest {

    @Test
    public void tests() {
        assertEquals("For number = 3", 15, MultiplyTheNumber.multiply(3));
        assertEquals("For number = 10", 250, MultiplyTheNumber.multiply(10));
        assertEquals("For number = 200", 25000, MultiplyTheNumber.multiply(200));
        assertEquals("For number = 0", 0, MultiplyTheNumber.multiply(0));
        assertEquals("For number = -3", -15, MultiplyTheNumber.multiply(-3));
    }

}
