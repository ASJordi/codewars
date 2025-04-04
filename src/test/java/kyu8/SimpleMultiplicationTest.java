package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleMultiplicationTest {

    @Test
    public void testOne() {
        System.out.println("Checking for Odd numbers.");
        assertEquals(9, SimpleMultiplication.simpleMultiplication(1));
        assertEquals(27, SimpleMultiplication.simpleMultiplication(3));
        assertEquals(189, SimpleMultiplication.simpleMultiplication(21));
        assertEquals(207, SimpleMultiplication.simpleMultiplication(23));
    }

    @Test
    public void testTwo() {
        System.out.println("Checking for Even numbers.");
        assertEquals(16, SimpleMultiplication.simpleMultiplication(2));
        assertEquals(32, SimpleMultiplication.simpleMultiplication(4));
        assertEquals(176, SimpleMultiplication.simpleMultiplication(22));
        assertEquals(208, SimpleMultiplication.simpleMultiplication(26));
    }

}
