package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LengthAndTwoValuestTest {

    @Test
    public void smallArray() {
        assertEquals(new String[]{"true", "false", "true", "false", "true"},
                5, "true", "false");
    }

    @Test
    public void largerArray() {
        assertEquals(new String[]{"blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red"},
                20, "blue", "red");
    }

    @Test
    public void withZero() {
        assertEquals(new String[0], 0, "lemons", "apples");
    }

    private void assertEquals(String[] expected, int n, String firstValue, String secondValue) {
        String[] actual = LengthAndTwoValues.alternate(n, firstValue, secondValue);
        assertArrayEquals(expected, actual, String.format("For input (%d, \"%s\", \"%s\")%nExpected: %s%nActual: %s%n", n, firstValue, secondValue, Arrays.toString(expected), Arrays.toString(actual)));
    }

}
