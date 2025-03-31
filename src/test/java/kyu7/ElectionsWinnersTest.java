package kyu7;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ElectionsWinnersTest {

    private static void test(final int expected, final int[] input, final int k) {
        assertEquals(expected, ElectionsWinners.find(input, k), "For input " + Arrays.toString(input) + " and k = " + k);
    }

    @Test
    void basicTests() {
        test(2, new int[]{2, 3, 5, 2}, 3);
        test(0, new int[]{1, 3, 3, 1, 1}, 0);
        test(1, new int[]{5, 1, 3, 4, 1}, 0);
        test(4, new int[]{1, 1, 1, 1}, 1);
        test(0, new int[]{1, 1, 1, 1}, 0);
        test(2, new int[]{3, 1, 1, 3, 1}, 2);
    }

}
