package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoIGetABonusTest {

    @Test
    public void basicTests() {
        boolean wellConfigured = unicodeTest();
        assertEquals(("£") + "100000", DoIGetABonus.bonusTime(10000, true));
        assertEquals(("£") + "250000", DoIGetABonus.bonusTime(25000, true));
        assertEquals(("£") + "10000", DoIGetABonus.bonusTime(10000, false));
        assertEquals(("£") + "60000", DoIGetABonus.bonusTime(60000, false));
        assertEquals(("£") + "20", DoIGetABonus.bonusTime(2, true));
        assertEquals(("£") + "78", DoIGetABonus.bonusTime(78, false));
        assertEquals(("£") + "678900", DoIGetABonus.bonusTime(67890, true));
    }

    public boolean unicodeTest() {
        System.out.println("\u00A3 == £:" + "\u00A3".equalsIgnoreCase("£"));
        System.out.println("if previous result was false or had ? symbol then perhaps you need to escape unicode due to misconfiguration");
        return "\u00A3".equalsIgnoreCase("£");
    }

}
