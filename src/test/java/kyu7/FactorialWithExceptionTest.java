package kyu7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialWithExceptionTest {

    private FactorialWithException fact;

    @BeforeEach
    public void initFactorial() {
        fact = new FactorialWithException();
    }

    @AfterEach
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
