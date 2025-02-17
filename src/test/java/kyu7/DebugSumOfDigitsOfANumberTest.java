package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebugSumOfDigitsOfANumberTest {

    @Test
    public void sampleTestOne() {
        assertEquals(6, DebugSumOfDigitsOfANumber.sumOfDigits(123));
    }

    @Test
    public void sampleTestTwo() {
        assertEquals(1, DebugSumOfDigitsOfANumber.sumOfDigits(1));
    }

    @Test
    public void sampleTestThree() {
        assertEquals(1, DebugSumOfDigitsOfANumber.sumOfDigits(100));
    }

    @Test
    public void sampleTestFour() {
        assertEquals(12, DebugSumOfDigitsOfANumber.sumOfDigits(291));
    }

    @Test
    public void sampleTestFive() {
        assertEquals(36, DebugSumOfDigitsOfANumber.sumOfDigits(9999));
    }

}
