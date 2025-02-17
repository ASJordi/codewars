package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ALettersBestFriendTest {

    @Test
    public void basicTestCases() {
        assertTrue(
                ALettersBestFriend.bestFriend("he headed to the store", 'h', 'e'),
                "for input: \"he headed to the store\", 'h', 'e'"
        );

        assertTrue(
                ALettersBestFriend.bestFriend("i found an ounce with my hound", 'o', 'u'),
                "for input: \"i found an ounce with my hound\", 'o', 'u'"
        );

        assertTrue(
                ALettersBestFriend.bestFriend("those were their thorns they said", 't', 'h'),
                "for input: \"those were their thorns they said\", 't', 'h'"
        );

        assertFalse(ALettersBestFriend.bestFriend("we found your dynamite", 'd', 'y'),
                "for input: \"we found your dynamite\", 'd', 'y'"
        );

        assertFalse(ALettersBestFriend.bestFriend("look they took the cookies", 'o', 'o'),
                "for input: \"look they took the cookies\", 'o', 'o'"
        );

        assertFalse(ALettersBestFriend.bestFriend("a test", 't', 'e'), "for input: \"a test\", 't', 'e'");
        assertFalse(ALettersBestFriend.bestFriend("abcdee", 'e', 'e'), "for input: \"abcdee\", 'e', 'e'");
        assertFalse(ALettersBestFriend.bestFriend("abcde", 'e', 'e'), "for input: \"abcde\", 'e', 'e'");
        assertTrue(ALettersBestFriend.bestFriend("xaeaex", 'a', 'e'), "for input: \"xaeaex\", 'a', 'e'");
        assertTrue(ALettersBestFriend.bestFriend("", 'x', 'y'), "for input: \"\", 'x', 'y'");
    }

}
