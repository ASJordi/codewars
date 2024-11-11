package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DotCalculatorTest {

    @Test
    public void exampleTest() {
        assertEquals(".....", DotCalculator.calc("..... // ."));
        assertEquals("..........", DotCalculator.calc("..... * .."));
        assertEquals("..", DotCalculator.calc("..... // .."));
        assertEquals("....", DotCalculator.calc("..... - ."));
        assertEquals("....................", DotCalculator.calc("..... + ..............."));
        assertEquals("...............", DotCalculator.calc("..... * ..."));
        assertEquals("..", DotCalculator.calc("..... - ..."));
        assertEquals("", DotCalculator.calc(". - ."));
        assertEquals("", DotCalculator.calc(". // .."));
    }

}
