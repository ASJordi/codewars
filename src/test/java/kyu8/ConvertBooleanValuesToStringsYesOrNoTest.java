package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertBooleanValuesToStringsYesOrNoTest {

    @Test
    public void testBoolToWord() {
        assertEquals(ConvertBooleanValuesToStringsYesOrNo.boolToWord(true), "Yes");
        assertEquals(ConvertBooleanValuesToStringsYesOrNo.boolToWord(false), "No");
    }

}
