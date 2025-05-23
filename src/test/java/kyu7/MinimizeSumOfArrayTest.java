package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimizeSumOfArrayTest {

    @Test
    public void basicTests() {
        assertEquals( 22, MinimizeSumOfArray.minSum(new int[]{5,4,2,3}));
        assertEquals(342, MinimizeSumOfArray.minSum(new int[]{12,6,10,26,3,24}));
        assertEquals( 74, MinimizeSumOfArray.minSum(new int[]{9,2,8,7,5,4,0,6}));
    }

}
