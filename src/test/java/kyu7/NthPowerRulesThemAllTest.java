package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthPowerRulesThemAllTest {

    @Test
    public void basicTests() {
        assertEquals(30, NthPowerRulesThemAll.modifiedSum(new int[] {1,2,3}, 3));
        assertEquals(30, NthPowerRulesThemAll.modifiedSum(new int[] {1,2}, 5));
    }

}
