package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsValidIdentifierTest {

    @Test
    public void testValid() {
        assertEquals(true, IsValidIdentifier.isValid("i1"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, IsValidIdentifier.isValid("1i"));
    }

}
