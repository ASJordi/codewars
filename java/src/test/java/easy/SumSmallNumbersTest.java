package easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumSmallNumbersTest {

    @Test
    public void testSum() throws Exception {
        byte a = 1;
        byte b = 2;
        assertEquals(3, SumSmallNumbers.sum(a, b));
    }

}
