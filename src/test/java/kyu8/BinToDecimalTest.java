package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinToDecimalTest {

    @Test
    public void testHoopCount() {
        assertEquals(1, BinToDecimal.binToDecimal("1"));
        assertEquals(0, BinToDecimal.binToDecimal("0"));
        assertEquals(73, BinToDecimal.binToDecimal("1001001"));
    }

}
