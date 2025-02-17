package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheDivisorsOfANumberTest {

    CountTheDivisorsOfANumber fd = new CountTheDivisorsOfANumber();

    @Test
    public void oneTest() {
        assertEquals(1, fd.numberOfDivisors(1));
    }

    @Test
    public void fourTest() {
        assertEquals(3, fd.numberOfDivisors(4));
    }

    @Test
    public void fiveTest() {
        assertEquals(2, fd.numberOfDivisors(5));
    }

    @Test
    public void twelveTest() {
        assertEquals(6, fd.numberOfDivisors(12));
    }

    @Test
    public void thirtyTest() {
        assertEquals(8, fd.numberOfDivisors(30));
    }

}
