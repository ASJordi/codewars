package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PossibilitiesArrayTest {

    @Test
    public void simpleTests() {
        assertTrue(PossibilitiesArray.isAllPossibilities(new int[]{0, 1, 2, 3}));
        assertFalse(PossibilitiesArray.isAllPossibilities(new int[]{1, 2, 3, 4}));
        assertFalse(PossibilitiesArray.isAllPossibilities(new int[]{6, 0, 4}));
    }

}
