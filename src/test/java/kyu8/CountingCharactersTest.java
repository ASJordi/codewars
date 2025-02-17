package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingCharactersTest {

    @Test
    public void test_some_characters() {
        assertEquals(3, CountingCharacters.countCharOccurrences("missippi", 'i'));
        assertEquals(2, CountingCharacters.countCharOccurrences("feed", 'e'));
    }

    @Test
    public void test_all_characters() {
        assertEquals(8, CountingCharacters.countCharOccurrences("aaaaaaaa", 'a'));
    }

    @Test
    public void test_no_characters() {
        assertEquals(0, CountingCharacters.countCharOccurrences("quicksilver", 'z'));
    }

}
