package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllUniqueTest {

    @Test
    public void testBasicExamples() {
        assertFalse(AllUnique.hasUniqueChars("  nAa"));
        assertTrue(AllUnique.hasUniqueChars("abcde"));
        assertFalse(AllUnique.hasUniqueChars("++-"));
        assertTrue(AllUnique.hasUniqueChars("AaBbc"));
    }

}
