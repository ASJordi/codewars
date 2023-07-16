package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertBooleanValuesToStringsYesOrNoTest {

    @Test
    public void testBoolToWord() {
        assertEquals(ConvertBooleanValuesToStringsYesOrNo.boolToWord(true),"Yes");
        assertEquals(ConvertBooleanValuesToStringsYesOrNo.boolToWord(false),"No");
    }

}
