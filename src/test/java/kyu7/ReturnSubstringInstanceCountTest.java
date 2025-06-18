package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReturnSubstringInstanceCountTest {

    private void doTest(String fullText, String search, int expected) {
        String messageOnFail = "Test failed for fullText = \"" + fullText + "\", search = \"" + search + "\"\n\n";

        assertEquals(expected, ReturnSubstringInstanceCount.substringCount(fullText, search), messageOnFail);
    }

    @Test
    @DisplayName("Sample tests")
    void fixedTests() {
        doTest("abcdeb", "b", 2);
        doTest("abcdeb", "a", 1);
        doTest("ccddeeccddeecc", "cc", 3);

        // overlaps
        doTest("aaabbbccc", "bb", 1);
        doTest(",,,..239,,,,,.,", ",,", 3);
    }

}
