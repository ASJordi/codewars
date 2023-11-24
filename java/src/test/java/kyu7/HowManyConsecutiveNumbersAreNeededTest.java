package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HowManyConsecutiveNumbersAreNeededTest {

    @Test
    public void exampleTests() {
        assertEquals(2, HowManyConsecutiveNumbersAreNeeded.consecutive(new int[]{4,8,6}));
        assertEquals(0, HowManyConsecutiveNumbersAreNeeded.consecutive(new int[]{1,2,3,4}));
        assertEquals(0, HowManyConsecutiveNumbersAreNeeded.consecutive(new int[]{}));
        assertEquals(0, HowManyConsecutiveNumbersAreNeeded.consecutive(new int[]{1}));
    }

}
