package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HowGoodAreYouReallyTest {

    @Test
    public void tests() {
        assertTrue(HowGoodAreYouReally.betterThanAverage(new int[]{2, 3}, 5));
        assertTrue(HowGoodAreYouReally.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertTrue(HowGoodAreYouReally.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertFalse(HowGoodAreYouReally.betterThanAverage(new int[]{100, 90}, 11));
    }

}
