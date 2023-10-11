package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BasicSequencePracticeTest {

    @Test
    public void testKnownValues() {
        assertArrayEquals(new int[]{0, 1, 3, 6}, BasicSequencePractice.sumOfN(3));
        assertArrayEquals(new int[]{0, -1, -3, -6, -10}, BasicSequencePractice.sumOfN(-4));
        assertArrayEquals(new int[]{0, 1}, BasicSequencePractice.sumOfN(1));
        assertArrayEquals(new int[]{0}, BasicSequencePractice.sumOfN(0));
    }

}
