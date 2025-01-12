package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AllUniqueTest {

    @Test
    public void testBasicExamples() {
        assertFalse(AllUnique.hasUniqueChars("  nAa"));
        assertTrue(AllUnique.hasUniqueChars("abcde"));
        assertFalse(AllUnique.hasUniqueChars("++-"));
        assertTrue(AllUnique.hasUniqueChars("AaBbc"));
    }

}
