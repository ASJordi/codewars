package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TakeTheFirstNElementsTest {

    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{0, 1, 2}, TakeTheFirstNElements.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3), "should return the first 3 items");
    }

}
