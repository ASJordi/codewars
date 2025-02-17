package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SwappingCardsTest {

    @Test
    public void sampleTests() {
        assertTrue(SwappingCards.swapCards(12, 28));
        assertTrue(SwappingCards.swapCards(48, 54));
        assertTrue(SwappingCards.swapCards(13, 12));
        assertTrue(SwappingCards.swapCards(25, 41));
        assertTrue(SwappingCards.swapCards(41, 98));
        assertFalse(SwappingCards.swapCards(67, 53));
        assertFalse(SwappingCards.swapCards(77, 54));
        assertFalse(SwappingCards.swapCards(45, 23));
        assertTrue(SwappingCards.swapCards(74, 81));
        assertTrue(SwappingCards.swapCards(75, 35));
        assertTrue(SwappingCards.swapCards(21, 25));
        assertTrue(SwappingCards.swapCards(22, 34));
        assertFalse(SwappingCards.swapCards(24, 12));
        assertTrue(SwappingCards.swapCards(52, 46));
        assertFalse(SwappingCards.swapCards(88, 45));
        assertTrue(SwappingCards.swapCards(75, 87));
        assertFalse(SwappingCards.swapCards(48, 14));
    }

}
