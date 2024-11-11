package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DebugSumOfDigitsOfANumberTest {

    @Test
    public void sampleTestOne() {
        assertEquals("For input: " + 123, 6, DebugSumOfDigitsOfANumber.sumOfDigits(123));
    }

    @Test
    public void sampleTestTwo() {
        assertEquals("For input: " + 1, 1, DebugSumOfDigitsOfANumber.sumOfDigits(1));
    }

    @Test
    public void sampleTestThree() {
        assertEquals("For input: " + 100, 1, DebugSumOfDigitsOfANumber.sumOfDigits(100));
    }

    @Test
    public void sampleTestFour() {
        assertEquals("For input: " + 291, 12, DebugSumOfDigitsOfANumber.sumOfDigits(291));
    }

    @Test
    public void sampleTestFive() {
        assertEquals("For input: " + 9999, 36, DebugSumOfDigitsOfANumber.sumOfDigits(9999));
    }

}
