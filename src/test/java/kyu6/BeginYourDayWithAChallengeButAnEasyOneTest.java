package kyu6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BeginYourDayWithAChallengeButAnEasyOneTest {

    void doTest(int n, String[] expected) {
        String[] actual = BeginYourDayWithAChallengeButAnEasyOne.oneTwoThree(n);
        String message = "oneTwoThree(" + n + ") should return [\"" + expected[0] + "\", \"" + expected[1] + "\"]," +
                " but returned [\"" + actual[0] + "\",\"" + actual[1] + "\"].";

        assertArrayEquals(expected, actual, message);
    }

    @Test
    void basicTests() {
        doTest(0, new String[] {"0", "0"});
        doTest(1, new String[] {"1", "1"});
        doTest(2, new String[] {"2", "11"});
        doTest(3, new String[] {"3", "111"});
        doTest(19, new String[] {"991", "1111111111111111111"});
        doTest(98, new String[] {"99999999998", "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"});
        doTest(112, new String[] {"9999999999994", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"});
    }

}
