package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TerminalGameCombatFunctionTest {

    @Test
    public void sampleTest() {
        assertEquals(95, TerminalGameCombatFunction.combat(100, 5), "For health = 100, damage = 5");
        assertEquals(84, TerminalGameCombatFunction.combat(92, 8), "For health = 92, damage = 8");
        assertEquals(0, TerminalGameCombatFunction.combat(20, 30), "For health = 20, damage = 30");
        assertEquals(1, TerminalGameCombatFunction.combat(50, 49), "For health = 50, damage = 49");
        assertEquals(0, TerminalGameCombatFunction.combat(33, 33), "For health = 33, damage = 33");
    }

}
