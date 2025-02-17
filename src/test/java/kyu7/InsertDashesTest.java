package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertDashesTest {

    @Test
    public void sampleTests() {
        assertEquals("4547-9-3", InsertDashes.insertDash(454793));
        assertEquals("123456", InsertDashes.insertDash(123456));
        assertEquals("1003-567", InsertDashes.insertDash(1003567));
    }

}
