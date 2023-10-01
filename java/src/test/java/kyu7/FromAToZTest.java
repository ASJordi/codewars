package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FromAToZTest {

    @Test
    public void sampleTests(){
        assertEquals("abcdefghijklmnopqrstuvwxyz", FromAToZ.gimmeTheLetters("a-z"));
        assertEquals("hijklmno", FromAToZ.gimmeTheLetters("h-o"));
        assertEquals("QRSTUVWXYZ", FromAToZ.gimmeTheLetters("Q-Z"));
        assertEquals("J", FromAToZ.gimmeTheLetters("J-J"));
        assertEquals("ab", FromAToZ.gimmeTheLetters("a-b"));
        assertEquals("a", FromAToZ.gimmeTheLetters("a-a"));
        assertEquals("ghi", FromAToZ.gimmeTheLetters("g-i"));
        assertEquals("HI", FromAToZ.gimmeTheLetters("H-I"));
        assertEquals("yz", FromAToZ.gimmeTheLetters("y-z"));
        assertEquals("efghijk", FromAToZ.gimmeTheLetters("e-k"));
        assertEquals("abcdefghijklmnopq", FromAToZ.gimmeTheLetters("a-q"));
        assertEquals("FGHIJKLMNO", FromAToZ.gimmeTheLetters("F-O"));
    }
}
