package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NDimensionalVectorMagnitudeTest {

    @Test
    void zeroVector() {
        double[] vector = new double[]{0d, 0d};
        assertEquals(0d, NDimensionalVectorMagnitude.magnitude(vector), 1e-10);
    }

    @Test
    void unitVector() {
        double[] vector = new double[]{2d / 3d, 1d / 3d, 2d / 3d};
        assertEquals(1d, NDimensionalVectorMagnitude.magnitude(vector), 1e-10);
    }

    @Test
    void negativeValues() {
        double[] vector = new double[]{-2d, -4d, 4d};
        assertEquals(6d, NDimensionalVectorMagnitude.magnitude(vector), 1e-10);
    }

}
