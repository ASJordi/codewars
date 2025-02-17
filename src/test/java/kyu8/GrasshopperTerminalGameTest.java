package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrasshopperTerminalGameTest {

    @Test()
    public void basicTests() {
        GrasshopperTerminalGame hero = new GrasshopperTerminalGame();
        assertEquals("Hero", hero.name, "Testing for name, without a parameter, to equal \"Hero\"");
        assertEquals(0, hero.experience, "Testing for experience to equal 0");
        assertEquals(100, hero.health, "Testing for health to equal 100");
        assertEquals("00", hero.position, "Testing for position to equal \"00\"");
        assertEquals(5, hero.damage, "Testing for damage to equal 5");

        GrasshopperTerminalGame bjornTheViking = new GrasshopperTerminalGame("Björn Øhrling");
        assertEquals("Björn Øhrling", bjornTheViking.name, "Testing for name, to equal \"Björn Øhrling\"");
    }

}
