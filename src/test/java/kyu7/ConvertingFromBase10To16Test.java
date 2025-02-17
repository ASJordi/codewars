package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertingFromBase10To16Test {

    @Test
    public void test() {
        assertEquals("0x100", ConvertingFromBase10To16.convertToHex(256));
    }

}
