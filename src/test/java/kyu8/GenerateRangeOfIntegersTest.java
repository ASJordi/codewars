package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class GenerateRangeOfIntegersTest {

    @Test
    public void testSomething() {
        int[] actual = GenerateRangeOfIntegers.generateRange(2, 10, 2);
        assertArrayEquals(
                "generateRange(2, 10, 2)\nExpected: [2, 4, 6, 8, 10]\nActual:   " + java.util.Arrays.toString(actual) + "\n",
                new int[]{2, 4, 6, 8, 10},
                actual
        );
    }

}
