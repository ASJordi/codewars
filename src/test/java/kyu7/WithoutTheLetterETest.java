package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutTheLetterETest {

    @Test
    public void findE() {
        assertEquals("There is no \"e\".", WithoutTheLetterE.findE("actual"), "Should return \"There is no \"e\".\"");
        assertEquals("1", WithoutTheLetterE.findE("e"), "Should return \"1\"");
        assertEquals("1", WithoutTheLetterE.findE("English"), "Should return \"1\"");
        assertEquals("4", WithoutTheLetterE.findE("English exercise"), "Should return \"4\"");
        assertEquals("", WithoutTheLetterE.findE(""), "Should return \"\"");
        assertEquals(null, WithoutTheLetterE.findE(null), "Should return null");
    }

}
