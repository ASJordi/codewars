package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticSequenceTest {

    @Test
    public void testArithmeticSequence_knownValues() {
        assertEquals(55, ArithmeticSequence.nthterm(0, 55, 1), "Wrong answer for first = 0 n = 55 d = 1");
        assertEquals(500, ArithmeticSequence.nthterm(0, 100, 5), "Wrong answer for first = 0 n = 100 d = 5");
        assertEquals(42, ArithmeticSequence.nthterm(14, 4, 7), "Wrong answer for first = 14 n = 4 d = 7");
        assertEquals(5050, ArithmeticSequence.nthterm(10000, 99, -50), "Wrong answer for first = 10000 n = 99 d = -50");
        assertEquals(4500, ArithmeticSequence.nthterm(10000, 110, -50), "Wrong answer for first = 10000 n = 110 d = -50");
        assertEquals(99, ArithmeticSequence.nthterm(0, 99, 1), "Wrong answer for first = 0 n = 99 d = 1");
    }

}
