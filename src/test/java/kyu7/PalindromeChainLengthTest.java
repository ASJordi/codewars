package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeChainLengthTest {

    @Test
    public void testPalindrome() {
        assertEquals(0, PalindromeChainLength.palindromeChainLength(1));
        assertEquals(0, PalindromeChainLength.palindromeChainLength(88));
        assertEquals(0, PalindromeChainLength.palindromeChainLength(393));
    }

    @Test
    public void testNonPalindrome() {
        assertEquals(1, PalindromeChainLength.palindromeChainLength(10));
        assertEquals(1, PalindromeChainLength.palindromeChainLength(134));
        assertEquals(4, PalindromeChainLength.palindromeChainLength(87));
        assertEquals(7, PalindromeChainLength.palindromeChainLength(2897));
        assertEquals(24, PalindromeChainLength.palindromeChainLength(89));
    }

}
