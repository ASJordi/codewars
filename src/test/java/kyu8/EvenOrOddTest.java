package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {

    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals("Even", EvenOrOdd.even_or_odd(6));
        assertEquals("Odd", EvenOrOdd.even_or_odd(7));
        assertEquals("Even", EvenOrOdd.even_or_odd(0));
        assertEquals("Odd", EvenOrOdd.even_or_odd(-1));
    }

}
