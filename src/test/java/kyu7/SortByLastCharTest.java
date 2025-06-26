package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortByLastCharTest {

    private static void doTest(String s, String[] expected) {
        String[] actual = SortByLastChar.last(s);
        String message  = String.format("last(\"%s\") returned an incorrect answer.\nExpected: [%s]\nBut got : [%s]\n\n",
                s,
                Arrays.stream(expected).map(st -> "\"" + st + "\"").collect(joining(", ")),
                Arrays.stream(actual).map(st -> "\"" + st + "\"").collect(joining(", "))
        );
        assertArrayEquals(expected, actual, message);
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest("man i need a taxi up to ubud", new String[]{"a", "need", "ubud", "i", "taxi", "man", "to", "up"});
        doTest("what time are we climbing up the volcano", new String[]{"time", "are", "we", "the", "climbing", "volcano", "up", "what"});
        doTest("take me to semynak", new String[]{"take", "me", "semynak", "to"});
        doTest("massage yes massage yes massage", new String[]{"massage", "massage", "massage", "yes", "yes"});
        doTest("take bintang and a dance please", new String[]{"a", "and", "take", "dance", "please", "bintang"});
    }

}
