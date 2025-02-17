package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HexToDecimalTest {

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(1, HexToDecimal.hexToDec("1"));
        assertEquals(10, HexToDecimal.hexToDec("a"));
        assertEquals(16, HexToDecimal.hexToDec("10"));
        assertEquals(255, HexToDecimal.hexToDec("FF"));
        assertEquals(-12, HexToDecimal.hexToDec("-C"));
    }

}
