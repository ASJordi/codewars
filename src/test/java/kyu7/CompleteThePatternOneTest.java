package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompleteThePatternOneTest {

    @Test
    public void testFixedCases(){
        assertEquals("Pattern for n=1 doesn't match", "1", CompleteThePatternOne.pattern(1));
        assertEquals("Pattern for n=2 doesn't match", "1\n22", CompleteThePatternOne.pattern(2));
        assertEquals("Pattern for n=5 doesn't match", "1\n22\n333\n4444\n55555", CompleteThePatternOne.pattern(5));
        assertEquals("Pattern for n=0 doesn't match", "", CompleteThePatternOne.pattern(0));
        assertEquals("Pattern for n=-25 doesn't match", "", CompleteThePatternOne.pattern(-25));
    }

}
