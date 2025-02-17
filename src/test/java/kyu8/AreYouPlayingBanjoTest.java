package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreYouPlayingBanjoTest {

    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals("Martin does not play banjo", AreYouPlayingBanjo.areYouPlayingBanjo("Martin"));
        assertEquals("Rikke plays banjo", AreYouPlayingBanjo.areYouPlayingBanjo("Rikke"));
        assertEquals("rolf plays banjo", AreYouPlayingBanjo.areYouPlayingBanjo("rolf"));
        assertEquals("bravo does not play banjo", AreYouPlayingBanjo.areYouPlayingBanjo("bravo"));
    }

}
