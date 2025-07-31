package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TrianglePerimeterIn2DTest {

    @Test
    void exampleTests() {
        doTest(new TrianglePerimeterIn2D.Geometry.Triangle(new TrianglePerimeterIn2D.Geometry.Point(10, 10), new TrianglePerimeterIn2D.Geometry.Point(40, 10), new TrianglePerimeterIn2D.Geometry.Point(10, 50)), 120);
        doTest(new TrianglePerimeterIn2D.Geometry.Triangle(new TrianglePerimeterIn2D.Geometry.Point(15, -10), new TrianglePerimeterIn2D.Geometry.Point(40, 20), new TrianglePerimeterIn2D.Geometry.Point(20, 50)), 135.314734);
    }

    private void doTest(final TrianglePerimeterIn2D.Geometry.Triangle t, final double expected) {
        assertEquals(expected, GeometryBasics.trianglePerimeter(t), 0.000001);
    }

    static class GeometryBasics {
        public static double trianglePerimeter(final TrianglePerimeterIn2D.Geometry.Triangle t) {
            double a = Math.hypot(t.a.x - t.b.x, t.a.y - t.b.y);
            double b = Math.hypot(t.b.x - t.c.x, t.b.y - t.c.y);
            double c = Math.hypot(t.c.x - t.a.x, t.c.y - t.a.y);
            return a + b + c;
        }
    }

}
