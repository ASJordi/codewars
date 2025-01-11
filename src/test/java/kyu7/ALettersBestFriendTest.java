package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ALettersBestFriendTest {

    @Test
    public void basicTestCases() {
        assertTrue("for input: \"he headed to the store\", 'h', 'e'",
                ALettersBestFriend.bestFriend("he headed to the store", 'h', 'e')
        );

        assertTrue("for input: \"i found an ounce with my hound\", 'o', 'u'",
                ALettersBestFriend.bestFriend("i found an ounce with my hound", 'o', 'u')
        );

        assertTrue("for input: \"those were their thorns they said\", 't', 'h'",
                ALettersBestFriend.bestFriend("those were their thorns they said", 't', 'h')
        );

        assertFalse("for input: \"we found your dynamite\", 'd', 'y'",
                ALettersBestFriend.bestFriend("we found your dynamite", 'd', 'y')
        );

        assertFalse("for input: \"look they took the cookies\", 'o', 'o'",
                ALettersBestFriend.bestFriend("look they took the cookies", 'o', 'o')
        );

        assertFalse("for input: \"a test\", 't', 'e'", ALettersBestFriend.bestFriend("a test", 't', 'e'));
        assertFalse("for input: \"abcdee\", 'e', 'e'", ALettersBestFriend.bestFriend("abcdee", 'e', 'e'));
        assertFalse("for input: \"abcde\", 'e', 'e'", ALettersBestFriend.bestFriend("abcde", 'e', 'e'));
        assertTrue("for input: \"xaeaex\", 'a', 'e'", ALettersBestFriend.bestFriend("xaeaex", 'a', 'e'));
        assertTrue("for input: \"\", 'x', 'y'", ALettersBestFriend.bestFriend("", 'x', 'y'));
    }
    
}
