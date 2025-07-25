package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfASequenceTest {

    @Test
    public void testSomething() {
        assertEquals(12, SumOfASequence.sequenceSum( 2,  6, 2), "sequenceSum(2, 6, 2)");
        assertEquals(15, SumOfASequence.sequenceSum( 1,  5, 1), "sequenceSum(1, 5, 1)");
        assertEquals(5, SumOfASequence.sequenceSum( 1,  5, 3), "sequenceSum(1, 5, 3)");
        assertEquals(45, SumOfASequence.sequenceSum( 0, 15, 3), "sequenceSum(0, 15, 3)");
        assertEquals(0, SumOfASequence.sequenceSum(16, 15, 3), "sequenceSum(16, 15, 3)");
    }
    
}
