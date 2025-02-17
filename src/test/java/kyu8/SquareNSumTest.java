package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareNSumTest {

    @Test
    public void testBasic() {
        assertEquals(9, SquareNSum.squareSum(new int[] {1,2,2}));
        assertEquals(5, SquareNSum.squareSum(new int[] {1,2}));
        assertEquals(50, SquareNSum.squareSum(new int[] {5,-3,4}));
        assertEquals(0, SquareNSum.squareSum(new int[] {}));
    }

}
