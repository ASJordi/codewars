package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertABooleanToAStringTest {

    @Test
    public void testTrue() {
        assertEquals("true", ConvertABooleanToAString.convert(true));
    }

    @Test
    public void testFalse() {
        assertEquals("false", ConvertABooleanToAString.convert(false));
    }

}
