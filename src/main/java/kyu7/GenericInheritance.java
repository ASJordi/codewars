package kyu7;

import java.util.*;

public class GenericInheritance {

    public static double sumAllAreas(List<? extends Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes)
            totalArea += shape.getArea();
        return totalArea;
    }
}

abstract class Shape {
    public abstract double getArea();
}

class Circle extends Shape {
    public final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    public final double width;
    public final double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    public final double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
}
