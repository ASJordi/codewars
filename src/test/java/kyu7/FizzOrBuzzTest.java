package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FizzOrBuzzTest {

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[]{5, 2, 1}, FizzOrBuzz.solution(20));
        assertArrayEquals(new int[]{0, 0, 0}, FizzOrBuzz.solution(2));
        assertArrayEquals(new int[]{4, 2, 0}, FizzOrBuzz.solution(14));
        assertArrayEquals(new int[]{8, 4, 1}, FizzOrBuzz.solution(30));
        assertArrayEquals(new int[]{37, 19, 9}, FizzOrBuzz.solution(141));
    }

}
