package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExesAndOhsTest {

    @Test
    public void basicTest() {
        assertTrue(ExesAndOhs.getXO("ooxx"));
        assertFalse(ExesAndOhs.getXO("xooxx"));
        assertTrue(ExesAndOhs.getXO("ooxXm"));
        assertTrue(ExesAndOhs.getXO("zpzpzpp"));
        assertFalse(ExesAndOhs.getXO("zzoo"));
        assertTrue(ExesAndOhs.getXO("xxxooo"));
        assertTrue(ExesAndOhs.getXO("xxxXooOo"));
        assertFalse(ExesAndOhs.getXO("xxx23424esdsfvxXXOOooo"));
        assertFalse(ExesAndOhs.getXO("xXxxoewrcoOoo"));
        assertFalse(ExesAndOhs.getXO("XxxxooO"));
        assertTrue(ExesAndOhs.getXO("zssddd"));
        assertFalse(ExesAndOhs.getXO("Xxxxertr34"));
        assertTrue(ExesAndOhs.getXO(""));
    }
}
