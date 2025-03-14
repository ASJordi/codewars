package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlternateCaseTest {

    @Test
    public void testSomething() {
        assertEquals("", AlternateCase.alternateCase(""));
        assertEquals("ABC", AlternateCase.alternateCase("abc"));
        assertEquals("abc", AlternateCase.alternateCase("ABC"));
        assertEquals("hELLO wORLD!", AlternateCase.alternateCase("Hello World!"));
    }

}
