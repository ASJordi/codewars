package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CWarsTest {

    @Test
    public void testExamples() {
        assertEquals("C.Wars", CWars.initials("code wars"));
//        assertEquals("B.H.Obama", CWars.initials("Barack hussain obama"));
//        assertEquals("B.H.Obama", CWars.initials("barrack hussain Obama"));
    }

}
