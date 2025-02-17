package kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SmallestValueOfAnArrayTest {

    @Test
    public void testSample() {
        assertEquals(0 , SmallestValueOfAnArray.findSmallest( new int [] {1, 2, 3} , "index") );
        assertEquals(2 , SmallestValueOfAnArray.findSmallest( new int [] {7, 12, 3, 2, 27} , "value") );
        assertEquals(3 , SmallestValueOfAnArray.findSmallest( new int [] {7, 12, 3, 2, 27} , "index") );
    }

}
