package kyu6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AscendDescendRepeatTest {

    @Test
    public void exampleTests() {
        assertEquals("12321", AscendDescendRepeat.ascendDescend(5, 1, 3));
        assertEquals("01210121012101", AscendDescendRepeat.ascendDescend(14, 0, 2));
        assertEquals("56789876567", AscendDescendRepeat.ascendDescend(11, 5, 9));
    }

}
