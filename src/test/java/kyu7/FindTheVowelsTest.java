package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindTheVowelsTest {

    private static void doTest(String wd, int[] expected) {
        int[] actual = FindTheVowels.vowelIndices(wd);
        assertArrayEquals(expected, actual, "Incorrect answer for word = \"" + wd + "\"\nExpected: " + Arrays.toString(expected) + "\nBut got :" + Arrays.toString(actual) + "\n\n");
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest("mmm", new int[]{});
        doTest("apple", new int[]{1, 5});
        doTest("super", new int[]{2, 4});
        doTest("orange", new int[]{1, 3, 6});
        doTest("supercalifragilisticexpialidocious", new int[]{2, 4, 7, 9, 12, 14, 16, 19, 21, 24, 25, 27, 29, 31, 32, 33});
    }

}
