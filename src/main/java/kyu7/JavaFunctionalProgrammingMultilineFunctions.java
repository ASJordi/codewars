package kyu7;

import java.util.function.ToDoubleFunction;

public class JavaFunctionalProgrammingMultilineFunctions {

    public static final ToDoubleFunction<Triangle> f = (Triangle t) -> {
        t.setArea((double) 1 / 2 * t.base * t.height);
        return t.getArea();
    };

}

class Triangle {
    public final int height;
    public final int base;
    private double area;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double a) {
        area = a;
    }
}
