package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolygonTest {

    @Test
    public void test1() {
        //Square with sides of 5 units
        Polygon poly = new Polygon(4, 5);
        assertEquals("5.000", String.format("%.3f", poly.circleDiameter()));
    }

    @Test
    public void test2() {
        //Octogon with sides of 9 units
        Polygon poly = new Polygon(8, 9);
        assertEquals("21.728", String.format("%.3f", poly.circleDiameter()));
    }

    @Test
    public void test3() {
        //Triangle with sides of 4 units
        Polygon poly = new Polygon(3, 4);
        assertEquals("2.309", String.format("%.3f", poly.circleDiameter()));
    }

}
