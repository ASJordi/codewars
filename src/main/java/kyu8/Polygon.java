package kyu8;

public class Polygon {

    int sides;
    int sideLength;
    double diameter;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter() {
        this.diameter = this.sideLength / Math.tan(Math.toRadians(180d / this.sides));
        return this.diameter;
    }

}
