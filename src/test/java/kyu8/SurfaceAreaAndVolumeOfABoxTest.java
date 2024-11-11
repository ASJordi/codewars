package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SurfaceAreaAndVolumeOfABoxTest {

    @Test
    public void test1() {

        assertArrayEquals(new int[] { 88, 48 }, SurfaceAreaAndVolumeOfABox.getSize(4, 2, 6));
        assertArrayEquals(new int[] { 6, 1 }, SurfaceAreaAndVolumeOfABox.getSize(1, 1, 1));
        assertArrayEquals(new int[] { 10, 2 }, SurfaceAreaAndVolumeOfABox.getSize(1, 2, 1));
        assertArrayEquals(new int[] { 16, 4 }, SurfaceAreaAndVolumeOfABox.getSize(1, 2, 2));
        assertArrayEquals(new int[] { 600, 1000 }, SurfaceAreaAndVolumeOfABox.getSize(10, 10, 10));

    }

}
