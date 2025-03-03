package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturnNegativeTest {

    @Test
    public void numberIsPositive() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
    }

    @Test
    public void numberIsNegative() {
        assertEquals(-10, ReturnNegative.makeNegative(-10));
    }

}
