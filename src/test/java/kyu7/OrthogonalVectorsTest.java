package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrthogonalVectorsTest {

    @Test
    void exampleTests() {
        assertFalse(OrthogonalVectors.isOrthogonal(new int[]{1, 2}, new int[]{2, 1}));
        assertTrue(OrthogonalVectors.isOrthogonal(new int[]{1, -2}, new int[]{2, 1}));
        assertFalse(OrthogonalVectors.isOrthogonal(new int[]{7, 8}, new int[]{7, -6}));
        assertTrue(OrthogonalVectors.isOrthogonal(new int[]{-13, -26}, new int[]{-8, 4}));
        assertTrue(OrthogonalVectors.isOrthogonal(new int[]{1, 2, 3}, new int[]{0, -3, 2}));
        assertFalse(OrthogonalVectors.isOrthogonal(new int[]{3, 4, 5}, new int[]{6, 7, -8}));
        assertTrue(OrthogonalVectors.isOrthogonal(new int[]{3, -4, -5}, new int[]{-4, -3, 0}));
        assertTrue(OrthogonalVectors.isOrthogonal(new int[]{1, -2, 3, -4}, new int[]{-4, 3, 2, -1}));
        assertTrue(OrthogonalVectors.isOrthogonal(new int[]{2, 4, 5, 6, 7}, new int[]{-14, -12, 0, 8, 4}));
        assertFalse(OrthogonalVectors.isOrthogonal(new int[]{5, 10, 1, 20, 2}, new int[]{-2, -20, -1, 10, 5}));
    }

}
