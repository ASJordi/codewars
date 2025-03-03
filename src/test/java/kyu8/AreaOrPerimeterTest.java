package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOrPerimeterTest {

    @Test
    public void isASquare() {
        assertEquals(16, AreaOrPerimeter.areaOrPerimeter(4, 4));
    }

    @Test
    public void isARectangle() {
        assertEquals(32, AreaOrPerimeter.areaOrPerimeter(6, 10));
    }
}
