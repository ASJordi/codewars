package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PowersOfITest {

    @Test
    public void testSomething() {
        assertEquals("1", PowersOfI.pofi(0));
        assertEquals("i", PowersOfI.pofi(1));
        assertEquals("-1", PowersOfI.pofi(2));
        assertEquals("-i", PowersOfI.pofi(3));
        assertEquals("1", PowersOfI.pofi(4));
        assertEquals("i", PowersOfI.pofi(5));
        assertEquals("-1", PowersOfI.pofi(6));
        assertEquals("-i", PowersOfI.pofi(7));
        assertEquals("1", PowersOfI.pofi(8));
        assertEquals("i", PowersOfI.pofi(9));
        assertEquals("-1", PowersOfI.pofi(10));
    }

}
