package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class DigitizeTest {

    @Test
    public void fixedTests() {
        assertArrayEquals("Should work for 123", new int[] {1, 2, 3}, Digitize.digitize(123));
        assertArrayEquals("Should work for 1", new int[] {1}, Digitize.digitize(1));
        assertArrayEquals("Should work for 0", new int[] {0}, Digitize.digitize(0));
        assertArrayEquals("Should work for 1230", new int[] {1, 2, 3, 0}, Digitize.digitize(1230));
        assertArrayEquals("Should work for 8675309", new int[] {8, 6, 7, 5, 3, 0, 9}, Digitize.digitize(8675309));
    }

}
