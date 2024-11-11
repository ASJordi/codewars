package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ReplaceAllDotsTest {

    @Test
    public void testSomeDots() {
        assertTrue("Sorry, try again :-(", "one-two-three".equals(ReplaceAllDots.replaceDots("one.two.three")));
    }

}
