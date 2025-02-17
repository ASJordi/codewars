package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DigitizeTest {

    @Test
    public void fixedTests() {
        assertArrayEquals(new int[] {1, 2, 3}, Digitize.digitize(123));
        assertArrayEquals(new int[] {1}, Digitize.digitize(1));
        assertArrayEquals(new int[] {0}, Digitize.digitize(0));
        assertArrayEquals(new int[] {1, 2, 3, 0}, Digitize.digitize(1230));
        assertArrayEquals(new int[] {8, 6, 7, 5, 3, 0, 9}, Digitize.digitize(8675309));
    }

}
