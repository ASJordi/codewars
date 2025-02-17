package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfASquareTest {

    private static final double DELTA = 1e-15;

    @Test
    public void basicTests() {
        assertEquals(1.62, AreaOfASquare.squareArea(2),DELTA);
        assertEquals(0, AreaOfASquare.squareArea(0),DELTA);
        assertEquals(80, AreaOfASquare.squareArea(14.05),DELTA);
    }

}
