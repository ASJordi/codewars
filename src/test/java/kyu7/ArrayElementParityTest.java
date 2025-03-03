package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayElementParityTest {

    @Test
    public void basicTests() {
        assertEquals(3, ArrayElementParity.solve(new int[]{1, -1, 2, -2, 3}));
        assertEquals(-4, ArrayElementParity.solve(new int[]{-3, 1, 2, 3, -1, -4, -2}));
        assertEquals(3, ArrayElementParity.solve(new int[]{1, -1, 2, -2, 3, 3}));
        assertEquals(-38, ArrayElementParity.solve(new int[]{-110, 110, -38, -38, -62, 62, -38, -38, -38}));
        assertEquals(-9, ArrayElementParity.solve(new int[]{-9, -105, -9, -9, -9, -9, 105}));
    }

}
