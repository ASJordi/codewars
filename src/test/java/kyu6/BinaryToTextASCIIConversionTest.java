package kyu6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryToTextASCIIConversionTest {

    @Test
    void testHello() {
        assertEquals(
                "Hello",
                BinaryToTextASCIIConversion.binaryToText("0100100001100101011011000110110001101111"));
    }

    @Test
    void testEmptyString() {
        assertEquals(
                "",
                BinaryToTextASCIIConversion.binaryToText(""));
    }

}
