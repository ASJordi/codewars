package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompleteThePatternTwoTest {

    @Test
    public void Test_For_1() {
        assertEquals("1", CompleteThePatternTwo.pattern(1));
    }

    @Test
    public void Test_For_5() {
        assertEquals("54321\n5432\n543\n54\n5", CompleteThePatternTwo.pattern(5));
    }

    @Test
    public void Test_For_10() {
        assertEquals("10987654321\n1098765432\n109876543\n10987654\n1098765\n109876\n10987\n1098\n109\n10", CompleteThePatternTwo.pattern(10));
    }

    @Test
    public void Test_For_0() {
        assertEquals("", CompleteThePatternTwo.pattern(0));
    }

    @Test
    public void Test_For_Minus5() {
        assertEquals("", CompleteThePatternTwo.pattern(-5));
    }

}
