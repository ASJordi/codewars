package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WilsonPrimeTest {

    @Test
    public void test1() {
        assertFalse(WilsonPrime.am_i_wilson(0));
    }

    @Test
    public void test2() {
        assertFalse(WilsonPrime.am_i_wilson(1));
    }

    @Test
    public void test3() {
        assertTrue(WilsonPrime.am_i_wilson(5));
    }

    @Test
    public void test4() {
        assertTrue(WilsonPrime.am_i_wilson(563));
    }

}
