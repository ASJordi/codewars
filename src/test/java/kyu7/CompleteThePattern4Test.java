package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompleteThePattern4Test {

    @Test
    public void pattern() throws Exception {
        assertEquals("1", CompleteThePattern4.pattern(1));
        assertEquals("12\n2", CompleteThePattern4.pattern(2));
        assertEquals("12345\n2345\n345\n45\n5", CompleteThePattern4.pattern(5));
        assertEquals("", CompleteThePattern4.pattern(0));
        assertEquals("", CompleteThePattern4.pattern(-25));
        assertEquals("", CompleteThePattern4.pattern(-59));
    }

}
