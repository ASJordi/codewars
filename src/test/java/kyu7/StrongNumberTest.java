package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrongNumberTest {

    private static final String STRONG = "STRONG!!!!";
    private static final String NOT_STRONG = "Not Strong !!";

    @Test
    public void testSomething() {
        assertEquals(STRONG, StrongNumber.isStrongNumber(1));
        assertEquals(STRONG, StrongNumber.isStrongNumber(2));
        assertEquals(STRONG, StrongNumber.isStrongNumber(145));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(7));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(93));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(185));
    }

}
