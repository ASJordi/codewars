package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TheFeastOfManyBeastsTest {

    @Test
    public void basicTest() {
        assertTrue(TheFeastOfManyBeasts.feast("great blue heron", "garlic nann"));
        assertTrue(TheFeastOfManyBeasts.feast("chickadee", "chocolate cake"));
        assertFalse(TheFeastOfManyBeasts.feast("brown bear", "bear claw"));
    }

}
