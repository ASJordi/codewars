package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class LunarMathematicsAdditionTest {

    @Test
    public void test_LunarMathAdd_GetsCorrectAnswer_SimpleTests() {
        assertEquals("4+ 5 ", 5, LunarMathematicsAddition.add(4, 5));
        assertEquals("5 + 5", 5, LunarMathematicsAddition.add(5, 5));
        assertEquals("6 + 3", 6, LunarMathematicsAddition.add(6, 3));
        assertEquals("5 + 0", 5, LunarMathematicsAddition.add(5, 0));
    }

    @Test
    public void test_LunarMathAdd_GetsCorrectAnswer_DoubleDigitTests() {
        assertEquals("10 + 20", 20, LunarMathematicsAddition.add(10, 20));
        assertEquals("30 + 11",31, LunarMathematicsAddition.add(30, 11));
        assertEquals("19 + 91", 99, LunarMathematicsAddition.add(91, 19));
        assertEquals("Two digits in the first number, one digit in the second number", 51, LunarMathematicsAddition.add(50, 1));
        assertEquals("One digit in the first number, two digits in the second number", 51, LunarMathematicsAddition.add(1, 50));
    }

    @Test
    public void test_LunarMathAdd_GetsCorrectAnswer_EdgeCases() {
        assertEquals("100 + 0", 100, LunarMathematicsAddition.add(100, 0));
        assertEquals("100 + 20",120, LunarMathematicsAddition.add(100, 20));
        assertEquals(11099, LunarMathematicsAddition.add(99, 11085));
        assertEquals(59, LunarMathematicsAddition.add(58, 19));
        assertEquals("Integer.MAX_VALUE + 0", Integer.MAX_VALUE, LunarMathematicsAddition.add(Integer.MAX_VALUE, 0));
        assertEquals("Integer.MAX_VALUE + INTEGER.MAX_VALUE",Integer.MAX_VALUE, LunarMathematicsAddition.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertEquals(987656789, LunarMathematicsAddition.add(123456789, 987654321));
    }

}
