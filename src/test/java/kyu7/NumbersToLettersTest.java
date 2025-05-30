package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersToLettersTest {

    private static void doTest(String[] arr, String expected) {
        assertEquals(expected, NumbersToLetters.switcher(arr),
                "switcher([" + Arrays.stream(arr).map(st -> "\"" + st + "\"").collect(joining(", ")) + "]) returned an incorrect answer.\n\n"
        );
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest(new String[]{"24", "12", "23", "22", "4", "26", "9", "8"}, "codewars");
        doTest(new String[]{"25","7","8","4","14","23","8","25","23","29","16","16","4"}, "btswmdsbd kkw");
        doTest(new String[]{"4", "24"}, "wc");
        doTest(new String[]{"12"}, "o");
        doTest(new String[]{"12","28","25","21","25","7","11","22","15"}, "o?bfbtpel");
    }

}
