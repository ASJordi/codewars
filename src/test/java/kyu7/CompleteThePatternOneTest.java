package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompleteThePatternOneTest {

    @Test
    public void testFixedCases() {
        assertEquals("1", CompleteThePatternOne.pattern(1));
        assertEquals("1\n22", CompleteThePatternOne.pattern(2));
        assertEquals("1\n22\n333\n4444\n55555", CompleteThePatternOne.pattern(5));
        assertEquals("", CompleteThePatternOne.pattern(0));
        assertEquals("", CompleteThePatternOne.pattern(-25));
    }

}
