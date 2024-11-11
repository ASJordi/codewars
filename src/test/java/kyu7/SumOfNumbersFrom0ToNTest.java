package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumOfNumbersFrom0ToNTest {

    @Test
    public void testBasic() {
        assertEquals("0+1+2+3+4+5+6 = 21", SumOfNumbersFrom0ToN.showSequence(6));
    }

}
