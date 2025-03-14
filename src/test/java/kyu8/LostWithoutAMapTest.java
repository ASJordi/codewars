package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LostWithoutAMapTest {

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[]{2, 4, 6}, LostWithoutAMap.map(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{8, 2, 2, 2, 8}, LostWithoutAMap.map(new int[]{4, 1, 1, 1, 4}));
        assertArrayEquals(new int[]{2, 2, 2, 2, 2, 2}, LostWithoutAMap.map(new int[]{1, 1, 1, 1, 1, 1}));
    }

}
