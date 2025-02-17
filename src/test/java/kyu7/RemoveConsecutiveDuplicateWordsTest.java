package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveConsecutiveDuplicateWordsTest {

    String s1 = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
    String ans1 = "alpha beta gamma delta alpha beta gamma delta";
    String s2 = "cyqje cyqje cyqje a a a";
    String ans2 = "cyqje a";

    @Test
    public void basicTest(){
        assertEquals("For input \"" + s1 + "\"", ans1, RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates(s1));
        assertEquals("For input \"" + s2 + "\"", ans2, RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates(s2));
        assertEquals("For input \"" + "" + "\"", "", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates(""));
        assertEquals("For input \"" + "word" + "\"", "word", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates("word"));
        assertEquals("For input \"" + "a a ab" + "\"", "a ab", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates("a a ab"));
    }

}
