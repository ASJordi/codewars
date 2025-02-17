package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReplaceAllDotsTest {

    @Test
    public void testSomeDots() {
        assertTrue("one-two-three".equals(ReplaceAllDots.replaceDots("one.two.three")), "Sorry, try again :-(");
    }

}
