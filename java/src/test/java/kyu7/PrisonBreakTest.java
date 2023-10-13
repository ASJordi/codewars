package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrisonBreakTest {

    @Test
    public void testBasicCases() {
        assertEquals(4, PrisonBreak.freedPrisoners(new Boolean[] { true, true, false, false, false, true, false }));
        assertEquals(2, PrisonBreak.freedPrisoners(new Boolean[] { true, false, false, false, false, false, false }));
        assertEquals(2, PrisonBreak.freedPrisoners(new Boolean[] { true, true, true, false, false, false }));
        assertEquals(6, PrisonBreak.freedPrisoners(new Boolean[] { true, false, true, false, true, false }));
        assertEquals("once the first prisoner is freed, all cells become locked", 1, PrisonBreak.freedPrisoners(new Boolean[] { true, true, true }));
        assertEquals("the first cell is locked, so no switches are possible", 0, PrisonBreak.freedPrisoners(new Boolean[] { false, false, false }));
        assertEquals("the first cell is locked, so no switches are possible", 0, PrisonBreak.freedPrisoners(new Boolean[] { false, true, true, true }));
    }

}
