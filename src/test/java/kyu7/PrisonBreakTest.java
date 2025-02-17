package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrisonBreakTest {

    @Test
    public void testBasicCases() {
        assertEquals(4, PrisonBreak.freedPrisoners(new Boolean[] { true, true, false, false, false, true, false }));
        assertEquals(2, PrisonBreak.freedPrisoners(new Boolean[] { true, false, false, false, false, false, false }));
        assertEquals(2, PrisonBreak.freedPrisoners(new Boolean[] { true, true, true, false, false, false }));
        assertEquals(6, PrisonBreak.freedPrisoners(new Boolean[] { true, false, true, false, true, false }));
        assertEquals(1, PrisonBreak.freedPrisoners(new Boolean[] { true, true, true }));
        assertEquals(0, PrisonBreak.freedPrisoners(new Boolean[] { false, false, false }));
        assertEquals(0, PrisonBreak.freedPrisoners(new Boolean[] { false, true, true, true }));
    }

}
