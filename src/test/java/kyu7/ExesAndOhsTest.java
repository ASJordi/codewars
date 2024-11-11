package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExesAndOhsTest {

    @Test
    public void basicTest(){
        assertEquals(true, ExesAndOhs.getXO("ooxx"));
        assertEquals(false, ExesAndOhs.getXO("xooxx"));
        assertEquals(true, ExesAndOhs.getXO("ooxXm"));
        assertEquals(true, ExesAndOhs.getXO("zpzpzpp"));
        assertEquals(false, ExesAndOhs.getXO("zzoo"));
        assertEquals(true, ExesAndOhs.getXO("xxxooo"));
        assertEquals(true, ExesAndOhs.getXO("xxxXooOo"));
        assertEquals(false, ExesAndOhs.getXO("xxx23424esdsfvxXXOOooo"));
        assertEquals(false, ExesAndOhs.getXO("xXxxoewrcoOoo"));
        assertEquals(false, ExesAndOhs.getXO("XxxxooO"));
        assertEquals(true, ExesAndOhs.getXO("zssddd"));
        assertEquals(false, ExesAndOhs.getXO("Xxxxertr34"));
        assertEquals(true, ExesAndOhs.getXO(""));
    }
}
