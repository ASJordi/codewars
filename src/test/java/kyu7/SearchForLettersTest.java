package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchForLettersTest {

    @Test
    public void sampleTests() {
        assertEquals("11000000000000000000000001", SearchForLetters.search("a **&  bZ"), "Failed for input: 'a **&  bZ'");
        assertEquals("11101000000000000000000001", SearchForLetters.search("Abc e  $$  z"), "Failed for input: 'Abc e  $$  z'");
        assertEquals("10000010000000000101000000", SearchForLetters.search("!!a$%&RgTT"), "Failed for input: '!!a$%&RgTT'");
        assertEquals("11111111111111111111111111", SearchForLetters.search("abcdefghijklmnopqrstuvwxyz"), "Failed for input: 'abcdefghijklmnopqrstuvwxyz'");
        assertEquals("10000000000000000000000000", SearchForLetters.search("aaaaaaaaaaa"), "Failed for input: 'aaaaaaaaaaa'");
        assertEquals("00010111000000000001000010", SearchForLetters.search("&%&%/$%$%$%$%GYtf67fg34678hgfdyd"), "Failed for input: '&%&%/$%$%$%$%GYtf67fg34678hgfdyd'");
    }
    
}
