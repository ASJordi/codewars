package kyu7;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EliminateTheIntrudersBitManipulationTest {

    @Test
    public void sampleTests() {
        assertEquals("For input \"11010101010101\"", 255, EliminateTheIntrudersBitManipulation.eliminateUnsetBits("11010101010101"));
        assertEquals("For input \"111\"", 7, EliminateTheIntrudersBitManipulation.eliminateUnsetBits("111"));
        assertEquals("For input \"1000000\"", 1, EliminateTheIntrudersBitManipulation.eliminateUnsetBits("1000000"));
        assertEquals("For empty input", 0, EliminateTheIntrudersBitManipulation.eliminateUnsetBits(""));
    }

}
