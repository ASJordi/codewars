package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GrasshopperTerminalGameTest {

    @Test()
    public void basicTests() {
        GrasshopperTerminalGame hero = new GrasshopperTerminalGame();
        assertEquals("Testing for name, without a parameter, to equal \"Hero\"", "Hero", hero.name);
        assertEquals("Testing for experience to equal 0", 0, hero.experience);
        assertEquals("Testing for health to equal 100", 100, hero.health);
        assertEquals("Testing for position to equal \"00\"", "00", hero.position);
        assertEquals("Testing for damage to equal 5", 5, hero.damage);

        GrasshopperTerminalGame bjornTheViking = new GrasshopperTerminalGame("Björn Øhrling");
        assertEquals("Testing for name, to equal \"Björn Øhrling\"", "Björn Øhrling", bjornTheViking.name);
    }

}
