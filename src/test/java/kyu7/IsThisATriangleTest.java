package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class IsThisATriangleTest {

    @Test
    public void publicTests() {
        assertEquals(true, IsThisATriangle.isTriangle(1,2,2));
        assertEquals(false, IsThisATriangle.isTriangle(7,2,2));
    }

}
