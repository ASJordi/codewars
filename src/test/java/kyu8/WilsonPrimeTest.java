package kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WilsonPrimeTest {

    @Test
    public void test1() {
        assertEquals(false, WilsonPrime.am_i_wilson(0));
    }

    @Test
    public void test2() {
        assertEquals(false, WilsonPrime.am_i_wilson(1));
    }

    @Test
    public void test3() {
        assertEquals(true, WilsonPrime.am_i_wilson(5));
    }

    @Test
    public void test4() {
        assertEquals(true, WilsonPrime.am_i_wilson(563));
    }

}
