package kyu7;

public class TrianglePerimeterIn2D {

    public static double trianglePerimeter(final Geometry.Triangle t) {
        double a = Math.hypot(t.a.x - t.b.x, t.a.y - t.b.y);
        double b = Math.hypot(t.b.x - t.c.x, t.b.y - t.c.y);
        double c = Math.hypot(t.c.x - t.a.x, t.c.y - t.a.y);
        return a + b + c;
    }

    static class Geometry {

        static class Point {
            double x;
            double y;

            public Point(double x, double y) {
                this.x = x;
                this.y = y;
            }
        }

        static class Triangle {
            Point a;
            Point b;
            Point c;

            public Triangle(Point a, Point b, Point c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
        }

    }

}
