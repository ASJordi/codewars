package kyu7;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class FactorialWithExceptionTest {

    private FactorialWithException fact;

    @Before
    public void initFactorial() {
        fact = new FactorialWithException();
    }

    @After
    public void afterFactorial() {
        fact = null;
    }

    @Test
    public void test_factorial0() {
        assertEquals(1, fact.factorial(0));
    }

    @Test
    public void test_factorial3() {
        assertEquals(6, fact.factorial(3));
    }

    @Test
    public void test_factorial5() {
        assertEquals(120, fact.factorial(5));
    }

}
