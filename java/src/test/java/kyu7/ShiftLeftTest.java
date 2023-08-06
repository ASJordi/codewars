package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShiftLeftTest {

    @Test
    public void shouldBeEqual() {
        assertEquals(2, ShiftLeft.shiftLeft("test", "west"));
        assertEquals(7, ShiftLeft.shiftLeft("test", "yes"));
        assertEquals(1, ShiftLeft.shiftLeft("b", "ab"));
        assertEquals(0, ShiftLeft.shiftLeft("test", "test"));
        assertEquals(0, ShiftLeft.shiftLeft("", ""));
    }

}
