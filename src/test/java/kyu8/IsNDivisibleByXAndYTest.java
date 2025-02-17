package kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IsNDivisibleByXAndYTest {

    @Test
    public void test1() {
        assertEquals(true, IsNDivisibleByXAndY.isDivisible(12,4,3), "n = 12, x = 4, y = 3\n");
    }
    @Test
    public void test2() {
        assertEquals(false, IsNDivisibleByXAndY.isDivisible(3,3,4), "n = 3, x = 3, y = 4\n");
    }

}
