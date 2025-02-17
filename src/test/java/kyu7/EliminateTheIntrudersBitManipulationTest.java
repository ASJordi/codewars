package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EliminateTheIntrudersBitManipulationTest {

    @Test
    public void sampleTests() {
        assertEquals(255, EliminateTheIntrudersBitManipulation.eliminateUnsetBits("11010101010101"));
        assertEquals(7, EliminateTheIntrudersBitManipulation.eliminateUnsetBits("111"));
        assertEquals(1, EliminateTheIntrudersBitManipulation.eliminateUnsetBits("1000000"));
        assertEquals(0, EliminateTheIntrudersBitManipulation.eliminateUnsetBits(""));
    }

}
