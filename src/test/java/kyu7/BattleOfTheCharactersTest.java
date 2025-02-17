package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BattleOfTheCharactersTest {

    @Test
    public void basicTests() {
        doTest("AAA", "Z", "Z");
        doTest("ONE", "TWO", "TWO");
        doTest("ONE", "NEO", "Tie!");
        doTest("FOUR", "FIVE", "FOUR");
    }

    private void doTest(final String x, final String y, final String expected) {
        assertEquals(expected, BattleOfTheCharacters.battle(x, y));
    }

}
