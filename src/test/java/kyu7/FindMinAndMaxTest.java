package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindMinAndMaxTest {

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[]{1, 1}, FindMinAndMax.getMinMax(List.of(1)));
        assertArrayEquals(new int[]{1, 2}, FindMinAndMax.getMinMax(Arrays.asList(1, 2)));
        assertArrayEquals(new int[]{1, 2}, FindMinAndMax.getMinMax(Arrays.asList(2, 1)));
    }

}
