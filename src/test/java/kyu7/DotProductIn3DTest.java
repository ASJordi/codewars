package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DotProductIn3DTest {

    @Test
    void sampleTests() {
        doTest(new DotProductIn3D.Vector3D(2, 0, -1), new DotProductIn3D.Vector3D(0, -2, 1), -1);
        doTest(new DotProductIn3D.Vector3D(1, 1, 1), new DotProductIn3D.Vector3D(2, -2, 2), 2);
        doTest(new DotProductIn3D.Vector3D(7, 2.5, -3), new DotProductIn3D.Vector3D(0.4, -0.9, 0.2), -0.05);
    }

    public static void doTest(final DotProductIn3D.Vector3D a, final DotProductIn3D.Vector3D b, final double expected) {
        assertEquals(expected, GeometryBasics.dotProduct(a, b), 0.000001);
    }

    static class GeometryBasics {
        public static double dotProduct(final DotProductIn3D.Vector3D a, final DotProductIn3D.Vector3D b) {
            return (a.x * b.x) + (a.y * b.y) + (a.z * b.z);
        }
    }

}
