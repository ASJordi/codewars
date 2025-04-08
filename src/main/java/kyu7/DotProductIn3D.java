package kyu7;

public class DotProductIn3D {

    public static double dotProduct(final Vector3D a, final Vector3D b) {
        return (a.x * b.x) + (a.y * b.y) + (a.z * b.z);
    }

    static class Vector3D {
        public double x;
        public double y;
        public double z;

        public Vector3D(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

}
