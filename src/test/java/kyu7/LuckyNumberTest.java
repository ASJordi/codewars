package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LuckyNumberTest {

    @Test
    public void test1() {
        assertTrue(LuckyNumber.isLucky(0), "With input 0");
    }

    @Test
    public void test2() {
        assertTrue(LuckyNumber.isLucky(1892376), "With input 1892376");
    }

    @Test
    public void test3() {
        assertFalse(LuckyNumber.isLucky(189237), "With input 189237");
    }

}
