package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckForFactorTest {

    @Test
    public void basicTests() {
        assertTrue(CheckForFactor.checkForFactor(10, 2));
        assertTrue(CheckForFactor.checkForFactor(63, 7));
        assertTrue(CheckForFactor.checkForFactor(2450, 5));
        assertTrue(CheckForFactor.checkForFactor(24612, 3));
    }

}
