package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfNumbersFrom0ToNTest {

    @Test
    public void testBasic() {
        assertEquals("0+1+2+3+4+5+6 = 21", SumOfNumbersFrom0ToN.showSequence(6));
    }

}
