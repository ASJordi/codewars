package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisagreeableAsciiTest {

    @Test
    public void testBasic() {
        assertEquals(DisagreeableAscii.getWeight("Joe"), 254);
        assertEquals(DisagreeableAscii.getWeight("CJ"), 205);
        assertEquals(DisagreeableAscii.getWeight("cj"), 141);
    }

}
