package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PointsOfReflectionTest {

    @Test
    public void BasicTest() {
        assertArrayEquals(new int[]{2,2}, PointsOfReflection.reflectPoint(new int[]{0,0}, new int[]{1,1}));
        assertArrayEquals(new int[]{-6,-18}, PointsOfReflection.reflectPoint(new int[]{2,6}, new int[]{-2,-6}));

        assertArrayEquals(new int[]{-30, 30}, PointsOfReflection.reflectPoint(new int[]{10, -10}, new int[]{-10, 10}));
        assertArrayEquals(new int[]{-25, 37}, PointsOfReflection.reflectPoint(new int[]{1, -35}, new int[]{-12, 1}));
        assertArrayEquals(new int[]{-1014, -443}, PointsOfReflection.reflectPoint(new int[]{1000, 15}, new int[]{-7, -214}));
        assertArrayEquals(new int[]{0,0}, PointsOfReflection.reflectPoint(new int[]{0,0}, new int[]{0,0}));
    }

}
