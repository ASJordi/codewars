package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsThisATriangleTest {

    @Test
    public void publicTests() {
        assertEquals(true, IsThisATriangle.isTriangle(1,2,2));
        assertEquals(false, IsThisATriangle.isTriangle(7,2,2));
    }

}
