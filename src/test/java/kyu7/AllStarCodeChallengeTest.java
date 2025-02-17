package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllStarCodeChallengeTest {

    @Test
    public void fixedTests() {
        assertEquals("1 hour(s) and 0 minute(s)", AllStarCodeChallenge.toTime(3600));
        assertEquals("1 hour(s) and 0 minute(s)", AllStarCodeChallenge.toTime(3601));
        assertEquals("0 hour(s) and 58 minute(s)", AllStarCodeChallenge.toTime(3500));
        assertEquals("89 hour(s) and 51 minute(s)", AllStarCodeChallenge.toTime(323500));
        assertEquals("0 hour(s) and 0 minute(s)", AllStarCodeChallenge.toTime(0));
    }

}
