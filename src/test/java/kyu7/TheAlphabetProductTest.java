package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheAlphabetProductTest {

    @Test
    void test1() {
        assertEquals( TheAlphabetProduct.alphabet(new int[] {2, 3, 4, 1, 12, 6, 2, 4}), 4 );
    }

    @Test
    void test2() {
        assertEquals( TheAlphabetProduct.alphabet(new int[] {2, 6, 7, 3, 14, 35, 15, 5}), 7 );
    }

    @Test
    void test3() {
        assertEquals( TheAlphabetProduct.alphabet(new int[] {20, 10, 6, 5, 4, 3, 2, 12}), 5 );
    }

    @Test
    void test4() {
        assertEquals( TheAlphabetProduct.alphabet(new int[] {2, 6, 18, 3, 6, 7, 42, 14}), 7 );
    }

    @Test
    void test5() {
        assertEquals( TheAlphabetProduct.alphabet(new int[] {7, 96, 8, 240, 12, 140, 20, 56}), 20 );
    }

    @Test
    void test6() {
        assertEquals( TheAlphabetProduct.alphabet(new int[] {20, 30, 6, 7, 4, 42, 28, 5}), 7 );
    }

}
