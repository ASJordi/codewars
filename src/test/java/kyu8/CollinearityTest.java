package kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollinearityTest {

    @DisplayName("Vectors directed in the same direction")
    @Order(1)
    @Test
    public void sameDirection() {
        assertTrue(Collinearity.collinearity(1, 1, 1, 1), "collinearity(1, 1, 1, 1)");
        assertTrue(Collinearity.collinearity(1, 2, 2, 4), "collinearity(1, 2, 2, 4)");
    }

    @DisplayName("Vectors directed in opposite directions")
    @Order(2)
    @Test
    public void oppositeDirection() {
        assertTrue(Collinearity.collinearity(1, 1, -1, -1), "collinearity(1, 1, -1, -1)");
        assertTrue(Collinearity.collinearity(1, -2, -2, 4), "collinearity(1, -2, -2, 4)");
    }

    @DisplayName("Vectors directed in different directions")
    @Order(3)
    @Test
    public void differentDirection() {
        assertFalse(Collinearity.collinearity(1, 1, 6, 1), "collinearity(1, 1, 6, 1)");
        assertFalse(Collinearity.collinearity(1, 2, 1, -2), "collinearity(1, 2, 1, -2)");
    }

    @DisplayName("Vectors contain zeros")
    @Order(4)
    @Test
    public void withZeros() {
        assertTrue(Collinearity.collinearity(4, 0, 11, 0), "collinearity(4, 0, 11, 0)");
        assertFalse(Collinearity.collinearity(0, 1, 6, 0), "collinearity(0, 1, 6, 0)");
        assertFalse(Collinearity.collinearity(4, 4, 0, 4), "collinearity(4, 4, 0, 4)");
    }

    @DisplayName("Vectors with x = 0  and y = 0")
    @Order(5)
    @Test
    public void zeroVectors() {
        assertTrue(Collinearity.collinearity(0, 0, 0, 0), "collinearity(0, 0, 0, 0)");
        assertTrue(Collinearity.collinearity(0, 0, 1, 0), "collinearity(0, 0, 1, 0)");
        assertTrue(Collinearity.collinearity(5, 7, 0, 0), "collinearity(5, 7, 0, 0)");
    }

}
