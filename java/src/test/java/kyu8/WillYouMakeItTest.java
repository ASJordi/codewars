package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WillYouMakeItTest {

    @Test
    public void basicTest() {
        assertTrue(WillYouMakeIt.zeroFuel(50, 25, 2));
        assertFalse(WillYouMakeIt.zeroFuel(100, 50, 1));
    }

}
