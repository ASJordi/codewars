package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FixStringCaseTest {

    @Test
    public void BasicTests() {
        assertEquals("code", FixStringCase.solve("code"));
        assertEquals("CODE", FixStringCase.solve("CODe"));
        assertEquals("code", FixStringCase.solve("COde"));
        assertEquals("code", FixStringCase.solve("Code"));
        assertEquals("", FixStringCase.solve(""));
    }

}
