package kyu7;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;

public class FindMinAndMaxTest {

    @Test
    public void sampleTests() {
        assertArrayEquals("input: [1]", new int[] {1, 1}, FindMinAndMax.getMinMax(Arrays.asList(1)));
        assertArrayEquals("input: [1, 2]", new int[] {1, 2}, FindMinAndMax.getMinMax(Arrays.asList(1, 2)));
        assertArrayEquals("input: [2, 1]", new int[] {1, 2}, FindMinAndMax.getMinMax(Arrays.asList(2, 1)));
    }

}
