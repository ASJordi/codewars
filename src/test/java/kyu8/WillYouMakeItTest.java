package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WillYouMakeItTest {

    @Test
    public void basicTest() {
        assertTrue(WillYouMakeIt.zeroFuel(50, 25, 2));
        assertFalse(WillYouMakeIt.zeroFuel(100, 50, 1));
    }

}
