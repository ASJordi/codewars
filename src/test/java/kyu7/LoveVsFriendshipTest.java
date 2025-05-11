package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoveVsFriendshipTest {

    @Test
    public void testSomething() {
        assertEquals(100, LoveVsFriendship.wordsToMarks("attitude"), "Input: 'attitude'");
        assertEquals(75, LoveVsFriendship.wordsToMarks("friends"), "Input: 'friends'");
        assertEquals(66, LoveVsFriendship.wordsToMarks("family"), "Input: 'family'");
        assertEquals(99, LoveVsFriendship.wordsToMarks("selfness"), "Input: 'selfness'");
        assertEquals(96, LoveVsFriendship.wordsToMarks("knowledge"), "Input: 'knowledge'");
        assertEquals(225, LoveVsFriendship.wordsToMarks("incomprehensibility"), "Input: 'incomprehensibility'");
    }

}
