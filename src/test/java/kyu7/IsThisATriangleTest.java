package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsThisATriangleTest {

    @Test
    public void publicTests() {
        assertTrue(IsThisATriangle.isTriangle(1, 2, 2));
        assertFalse(IsThisATriangle.isTriangle(7, 2, 2));
    }

}
