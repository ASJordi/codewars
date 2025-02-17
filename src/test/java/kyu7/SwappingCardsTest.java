package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwappingCardsTest {

    @Test
    public void sampleTests() {
        assertEquals(true, SwappingCards.swapCards(12, 28));
        assertEquals(true, SwappingCards.swapCards(48, 54));
        assertEquals(true, SwappingCards.swapCards(13, 12));
        assertEquals(true, SwappingCards.swapCards(25, 41));
        assertEquals(true, SwappingCards.swapCards(41, 98));
        assertEquals(false, SwappingCards.swapCards(67, 53));
        assertEquals(false, SwappingCards.swapCards(77, 54));
        assertEquals(false, SwappingCards.swapCards(45, 23));
        assertEquals(true, SwappingCards.swapCards(74, 81));
        assertEquals(true, SwappingCards.swapCards(75, 35));
        assertEquals(true, SwappingCards.swapCards(21, 25));
        assertEquals(true, SwappingCards.swapCards(22, 34));
        assertEquals(false, SwappingCards.swapCards(24, 12));
        assertEquals(true, SwappingCards.swapCards(52, 46));
        assertEquals(false, SwappingCards.swapCards(88, 45));
        assertEquals(true, SwappingCards.swapCards(75, 87));
        assertEquals(false, SwappingCards.swapCards(48, 14));
    }

}
