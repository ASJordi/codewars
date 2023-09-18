package kyu7;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SmallestValueOfAnArrayTest {

    @Test
    public void testSample() {
        assertEquals( "The smallest index" , 0 , SmallestValueOfAnArray.findSmallest( new int [] {1, 2, 3} , "index") );
        assertEquals( "The smallest value" , 2 , SmallestValueOfAnArray.findSmallest( new int [] {7, 12, 3, 2, 27} , "value") );
        assertEquals( "The smallest index" , 3 , SmallestValueOfAnArray.findSmallest( new int [] {7, 12, 3, 2, 27} , "index") );
    }

}
