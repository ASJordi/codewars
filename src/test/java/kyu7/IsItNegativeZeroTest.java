package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItNegativeZeroTest {

    private IsItNegativeZero solution = new IsItNegativeZero();

    @Test
    public void basic_tests() throws Exception {
        assertEquals(solution.isNegativeZero(-0f), true, "");
        assertEquals(solution.isNegativeZero(-5f), false, "");
        assertEquals(solution.isNegativeZero(-4f), false, "");
        assertEquals(solution.isNegativeZero(-3f), false, "");
        assertEquals(solution.isNegativeZero(-2f), false, "");
        assertEquals(solution.isNegativeZero(-1f), false, "");
        assertEquals(solution.isNegativeZero(0f), false, "");
        assertEquals(solution.isNegativeZero(1f), false, "");
        assertEquals(solution.isNegativeZero(2f), false, "");
        assertEquals(solution.isNegativeZero(3f), false, "");
        assertEquals(solution.isNegativeZero(4f), false, "");
        assertEquals(solution.isNegativeZero(5f), false, "");
    }

}
