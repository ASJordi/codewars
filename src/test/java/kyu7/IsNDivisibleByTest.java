package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsNDivisibleByTest {

    @Test
    public void basicTests() {
        assertFalse(IsNDivisibleBy.isDivisible(3, 3, 4));
        assertTrue(IsNDivisibleBy.isDivisible(12, 3, 4));
        assertFalse(IsNDivisibleBy.isDivisible(8, 3, 4, 2, 5));
    }

}
