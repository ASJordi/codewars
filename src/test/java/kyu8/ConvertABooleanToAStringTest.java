package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertABooleanToAStringTest {

    @Test
    public void testTrue(){
        assertEquals("true", ConvertABooleanToAString.convert(true));
    }

    @Test
    public void testFalse(){
        assertEquals("false", ConvertABooleanToAString.convert(false));
    }

}
