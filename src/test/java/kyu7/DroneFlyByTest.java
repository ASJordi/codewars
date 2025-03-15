package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DroneFlyByTest {

    private static void doTest(String lamps, String drone, String expected) {
        assertEquals(expected, DroneFlyBy.flyBy(lamps, drone),
                "flyBy(\"" + lamps + "\", \"" + drone + "\") returned an incorrect answer.\n\n"
        );
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest("xxxxxx", "====T", "ooooox");
        doTest("xxxxxxxxx", "==T", "oooxxxxxx");
        doTest("xxxxxxxxxxxxxxx", "=========T", "ooooooooooxxxxx");
    }

}
