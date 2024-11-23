package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CollinearityTest {

//    @DisplayName("Vectors directed in the same direction") @Order(1)
    @Test
    public void sameDirection() {
        assertTrue("collinearity(1, 1, 1, 1)", Collinearity.collinearity(1, 1, 1, 1));
        assertTrue("collinearity(1, 2, 2, 4)", Collinearity.collinearity(1, 2, 2, 4));
    }

//    @DisplayName("Vectors directed in opposite directions") @Order(2)
    @Test
    public void oppositeDirection() {
        assertTrue("collinearity(1, 1, -1, -1)", Collinearity.collinearity(1, 1, -1, -1));
        assertTrue("collinearity(1, -2, -2, 4)", Collinearity.collinearity(1, -2, -2, 4));
    }

//    @DisplayName("Vectors directed in different directions") @Order(3)
    @Test
    public void differentDirection() {
        assertFalse("collinearity(1, 1, 6, 1)", Collinearity.collinearity(1, 1, 6, 1));
        assertFalse("collinearity(1, 2, 1, -2)", Collinearity.collinearity(1, 2, 1, -2));
    }

//    @DisplayName("Vectors contain zeros") @Order(4)
    @Test
    public void withZeros() {
        assertTrue("collinearity(4, 0, 11, 0)", Collinearity.collinearity(4, 0, 11, 0));
        assertFalse("collinearity(0, 1, 6, 0)", Collinearity.collinearity(0, 1, 6, 0));
        assertFalse("collinearity(4, 4, 0, 4)", Collinearity.collinearity(4, 4, 0, 4));
    }

//    @DisplayName("Vectors with x = 0  and y = 0") @Order(5)
    @Test
    public void zeroVectors() {
        assertTrue("collinearity(0, 0, 0, 0)", Collinearity.collinearity(0, 0, 0, 0));
        assertTrue("collinearity(0, 0, 1, 0)", Collinearity.collinearity(0, 0, 1, 0));
        assertTrue("collinearity(5, 7, 0, 0)", Collinearity.collinearity(5, 7, 0, 0));
    }

}
