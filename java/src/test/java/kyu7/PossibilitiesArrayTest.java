package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PossibilitiesArrayTest {

    @Test
    public void simpleTests() {
        assertEquals(true, PossibilitiesArray.isAllPossibilities(new int[] {0, 1, 2, 3}));
        assertEquals(false, PossibilitiesArray.isAllPossibilities(new int[] {1, 2, 3, 4}));
        assertEquals(false, PossibilitiesArray.isAllPossibilities(new int[] {6, 0, 4}));
    }

}
