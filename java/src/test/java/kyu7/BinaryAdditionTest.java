package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinaryAdditionTest {

    @Test
    public void sampleTests() {
        assertEquals("10", BinaryAddition.binaryAddition(1, 1));
        assertEquals("1", BinaryAddition.binaryAddition(0, 1));
        assertEquals("1", BinaryAddition.binaryAddition(1, 0));
        assertEquals("100", BinaryAddition.binaryAddition(2, 2));
        assertEquals("111111", BinaryAddition.binaryAddition(51, 12));
    }

}
