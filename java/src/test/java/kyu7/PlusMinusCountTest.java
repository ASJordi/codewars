package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlusMinusCountTest {

    @Test
    public void basicTest() {
        assertEquals(0, PlusMinusCount.signChange(new int[] {1, 3, 4, 5}));
        assertEquals(2, PlusMinusCount.signChange(new int[] {1, -3, -4, 0, 5}));
        assertEquals(0, PlusMinusCount.signChange(new int[] {}));
        assertEquals(3, PlusMinusCount.signChange(new int[] {-47, 84, -30, -11, -5, 74, 77}));
    }

}
