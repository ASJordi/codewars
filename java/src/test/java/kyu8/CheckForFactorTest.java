package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckForFactorTest {

    @Test
    public void basicTests() {
        assertEquals(true, CheckForFactor.checkForFactor(10, 2));
        assertEquals(true, CheckForFactor.checkForFactor(63, 7));
        assertEquals(true, CheckForFactor.checkForFactor(2450, 5));
        assertEquals(true, CheckForFactor.checkForFactor(24612, 3));
    }

}
