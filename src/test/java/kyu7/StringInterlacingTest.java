package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringInterlacingTest {

    @Test
    public void interlaceTestA() {
        assertEquals("HWeolrllod", StringInterlacing.interlace("Hello", "World"));
    }

    @Test
    public void interlaceTestB() {
        assertEquals("sGoimmemleoGviimnm'e", StringInterlacing.interlace("Gimme", "some lovin'"));
    }

}
