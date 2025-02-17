package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PandemiaTest {

    private static final double DELTA = 0.000001;

    @Test
    public void infected() {
        assertEquals(100, Pandemia.infected("111111X111111X111111X"), DELTA);
        assertEquals(100, Pandemia.infected("X1XX"), DELTA);
        assertEquals(0, Pandemia.infected("00X0X000X"), DELTA);
        assertEquals(0, Pandemia.infected("0"), DELTA);
        assertEquals(100, Pandemia.infected("1"), DELTA);
        assertEquals(73.33333333333333, Pandemia.infected("01000000X000X011X0X"), DELTA);
        assertEquals(72.72727272727273, Pandemia.infected("01X000X010X011XX"), DELTA);
        assertEquals(0, Pandemia.infected("XXXXX"), DELTA);
        assertEquals(100, Pandemia.infected("0000000010"), DELTA);
        assertEquals(42.857142857142854, Pandemia.infected("X00X000000X10X0100"), DELTA);
    }

}
