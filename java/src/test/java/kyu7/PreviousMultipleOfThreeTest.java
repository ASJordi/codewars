package kyu7;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class PreviousMultipleOfThreeTest {

    @Test
    public void basicTest(){
        assertNull("For input 1", PreviousMultipleOfThree.prevMultOfThree(1));
        assertNull("For input 25", PreviousMultipleOfThree.prevMultOfThree(25));
        assertEquals(new Integer(36), PreviousMultipleOfThree.prevMultOfThree(36));
        assertEquals(new Integer(12), PreviousMultipleOfThree.prevMultOfThree(1244));
        assertEquals(new Integer(9), PreviousMultipleOfThree.prevMultOfThree(952406));
    }

}
