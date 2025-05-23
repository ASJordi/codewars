package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuessTheSequenceTest {

    @Test
    void test0() {
        int[] result = {1, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 16;
        String expected = Arrays.toString(result),
                actual = Arrays.toString(GuessTheSequence.sequence(x));
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 9;
        String expected = Arrays.toString(result),
                actual = Arrays.toString(GuessTheSequence.sequence(x));
        assertEquals(expected, actual);
    }

}
