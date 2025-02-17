package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheTernaryOperatorTest {

    @Test
    public void basicTests() {
        assertEquals("You're a(n) kid", TheTernaryOperator.describeAge(9));
        assertEquals("You're a(n) kid", TheTernaryOperator.describeAge(10));
        assertEquals("You're a(n) kid", TheTernaryOperator.describeAge(11));
        assertEquals("You're a(n) kid", TheTernaryOperator.describeAge(12));
        assertEquals("You're a(n) teenager", TheTernaryOperator.describeAge(13));
        assertEquals("You're a(n) teenager", TheTernaryOperator.describeAge(14));
        assertEquals("You're a(n) teenager", TheTernaryOperator.describeAge(15));
        assertEquals("You're a(n) teenager", TheTernaryOperator.describeAge(16));
        assertEquals("You're a(n) teenager", TheTernaryOperator.describeAge(17));
        assertEquals("You're a(n) adult", TheTernaryOperator.describeAge(18));
        assertEquals("You're a(n) adult", TheTernaryOperator.describeAge(19));
        assertEquals("You're a(n) adult", TheTernaryOperator.describeAge(63));
        assertEquals("You're a(n) adult", TheTernaryOperator.describeAge(64));
        assertEquals("You're a(n) elderly", TheTernaryOperator.describeAge(65));
        assertEquals("You're a(n) elderly", TheTernaryOperator.describeAge(66));
        assertEquals("You're a(n) elderly", TheTernaryOperator.describeAge(100));
    }

}
