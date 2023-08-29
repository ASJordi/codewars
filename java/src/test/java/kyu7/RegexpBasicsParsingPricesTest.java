package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RegexpBasicsParsingPricesTest {

    @Test
    public void testBasic() {
        assertEquals(null, RegexpBasicsParsingPrices.toCents(""));
        assertEquals(null, RegexpBasicsParsingPrices.toCents("1"));
        assertEquals(null, RegexpBasicsParsingPrices.toCents("1.23"));
        assertEquals(null, RegexpBasicsParsingPrices.toCents("$1"));
        assertEquals(Integer.valueOf(123), RegexpBasicsParsingPrices.toCents("$1.23"));
        assertEquals(Integer.valueOf(9999), RegexpBasicsParsingPrices.toCents("$99.99"));
        assertEquals(Integer.valueOf(1234567890), RegexpBasicsParsingPrices.toCents("$12345678.90"));
        assertEquals(Integer.valueOf(969), RegexpBasicsParsingPrices.toCents("$9.69"));
        assertEquals(Integer.valueOf(970), RegexpBasicsParsingPrices.toCents("$9.70"));
        assertEquals(Integer.valueOf(971), RegexpBasicsParsingPrices.toCents("$9.71"));
        assertEquals(null, RegexpBasicsParsingPrices.toCents("$1.23\n"));
        assertEquals(null, RegexpBasicsParsingPrices.toCents("\n$1.23"));
        assertEquals(Integer.valueOf(69), RegexpBasicsParsingPrices.toCents("$0.69"));
        assertEquals(null, RegexpBasicsParsingPrices.toCents("$9.69$4.3.7"));
        assertEquals(null, RegexpBasicsParsingPrices.toCents("$9.692"));
    }

}
