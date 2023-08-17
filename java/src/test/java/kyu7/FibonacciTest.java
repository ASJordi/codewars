package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void sampleTests() {
        assertEquals("fib(1)", 1, Fibonacci.fib(1));
        assertEquals("fib(2)", 1, Fibonacci.fib(2));
        assertEquals("fib(3)", 2, Fibonacci.fib(3));
        assertEquals("fib(4)", 3, Fibonacci.fib(4));
        assertEquals("fib(5)", 5, Fibonacci.fib(5));
    }

}
