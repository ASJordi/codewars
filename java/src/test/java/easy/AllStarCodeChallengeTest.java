package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllStarCodeChallengeTest {

    @Test
    public void basicTes() {
        assertEquals(1, AllStarCodeChallenge.strCount("Hello", 'o'));
        assertEquals(2, AllStarCodeChallenge.strCount("Hello", 'l'));
    }

    @Test
    public void stringIsEmpty() {
        assertEquals(0, AllStarCodeChallenge.strCount("",'z'));
    }

}
