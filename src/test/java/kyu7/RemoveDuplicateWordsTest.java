package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateWordsTest {

    @Test
    public void basicTests() {
        assertEquals("alpha beta gamma delta", RemoveDuplicateWords.removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", RemoveDuplicateWords.removeDuplicateWords("my cat is my cat fat"));
    }

}
