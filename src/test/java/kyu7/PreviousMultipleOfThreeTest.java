package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PreviousMultipleOfThreeTest {

    @Test
    public void basicTest(){
        assertNull(PreviousMultipleOfThree.prevMultOfThree(1));
        assertNull(PreviousMultipleOfThree.prevMultOfThree(25));
        assertEquals(Integer.valueOf(36), PreviousMultipleOfThree.prevMultOfThree(36));
        assertEquals(Integer.valueOf(12), PreviousMultipleOfThree.prevMultOfThree(1244));
        assertEquals(Integer.valueOf(9), PreviousMultipleOfThree.prevMultOfThree(952406));
    }

}
