package kyu7;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FizzBuzzTest {

    @Test
    public void sampleTests() {
        String[] expected = {"1"};
        String[] actual = FizzBuzz.fizzBuzz(1);
        assertArrayEquals(expected, actual, "Input: 1\nExpected: {\"1\"}\nActual:   " + Arrays.toString(actual) + "\n");

        expected = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"};
        actual = FizzBuzz.fizzBuzz(10);
        assertArrayEquals(expected, actual, "Input: 10\nExpected: {\"1\", \"2\", \"Fizz\", \"4\", \"Buzz\", \"Fizz\", \"7\", \"8\", \"Fizz\", \"Buzz\"}\nActual:   " + Arrays.toString(actual) + "\n");
    }

}
