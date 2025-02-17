package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnexpectedParsingTest {

    @Test
    public void test() {
        assertEquals("busy", UnexpectedParsing.getStatus(true).get("status"));
        assertEquals("available", UnexpectedParsing.getStatus(false).get("status"));
    }

}
