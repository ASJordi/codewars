package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AreaOfACircleTest {

    @Test
    public void testOne() {
        assertEquals(3.141, AreaOfACircle.area(1), 0.01);
    }

    @Test
    public void testExamples() {
        assertEquals( 5881.248, AreaOfACircle.area(43.2673), 0.01);
        assertEquals(14526.724, AreaOfACircle.area(68     ), 0.01);
    }

    @Test
    public void testZero() {
        assertThrows(IllegalArgumentException.class, () -> AreaOfACircle.area(0));
    }

    @Test
    public void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> AreaOfACircle.area(-1.0));
    }

}
