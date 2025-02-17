package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfTwoIntegersTest {

    @Test
    public void checkPositiveValues() {
        assertEquals( 3, SumOfTwoIntegers.add(1,2));
        assertEquals(24, SumOfTwoIntegers.add(5,19));
        assertEquals(40, SumOfTwoIntegers.add(23,17));
    }

    @Test
    public void checkNegativeValues() {
        assertEquals( -30, SumOfTwoIntegers.add(-14,-16));
        assertEquals(-226, SumOfTwoIntegers.add(-50,-176));
        assertEquals( -39, SumOfTwoIntegers.add(-10,-29));
    }

    @Test
    public void checkMixtureValues() {
        assertEquals(  0, SumOfTwoIntegers.add(-13,13));
        assertEquals( -9, SumOfTwoIntegers.add(-27,18));
        assertEquals(-60, SumOfTwoIntegers.add(-90,30));
    }

}
