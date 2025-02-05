package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class DoubleTroubleTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{1, 3, 5, 6, 7, 4}, DoubleTrouble.trouble(new int[]{1, 3, 5, 6, 7, 4, 3}, 7));
        assertArrayEquals(new int[]{4, 1, 4}, DoubleTrouble.trouble(new int[]{4, 1, 1, 1, 4}, 2));
        assertArrayEquals(new int[]{2, 2}, DoubleTrouble.trouble(new int[]{2, 6, 2}, 8));
        assertArrayEquals(new int[]{2}, DoubleTrouble.trouble(new int[]{2, 2, 2, 2, 2, 2}, 4));
    }

}
