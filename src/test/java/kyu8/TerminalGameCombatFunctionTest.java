package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TerminalGameCombatFunctionTest {

    @Test
    public void sampleTest() {
        assertEquals("For health = 100, damage = 5", 95, TerminalGameCombatFunction.combat(100,5));
        assertEquals("For health = 92, damage = 8", 84, TerminalGameCombatFunction.combat(92, 8));
        assertEquals( "For health = 20, damage = 30", 0, TerminalGameCombatFunction.combat(20,30));
        assertEquals( "For health = 50, damage = 49", 1, TerminalGameCombatFunction.combat(50,49));
        assertEquals( "For health = 33, damage = 33", 0, TerminalGameCombatFunction.combat(33,33));
    }

}
