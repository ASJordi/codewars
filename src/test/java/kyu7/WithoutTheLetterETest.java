package kyu7;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WithoutTheLetterETest {

    @Test
    public void findE() {
        assertEquals("Should return \"There is no \"e\".\"", "There is no \"e\".", WithoutTheLetterE.findE("actual"));
        assertEquals("Should return \"1\"", "1", WithoutTheLetterE.findE("e"));
        assertEquals("Should return \"1\"", "1", WithoutTheLetterE.findE("English"));
        assertEquals("Should return \"4\"", "4", WithoutTheLetterE.findE("English exercise"));
        assertEquals("Should return \"\"", "", WithoutTheLetterE.findE(""));
        assertEquals("Should return null", null, WithoutTheLetterE.findE(null));
    }

}
