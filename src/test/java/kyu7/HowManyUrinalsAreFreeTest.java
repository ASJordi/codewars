package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HowManyUrinalsAreFreeTest {

    @Test
    public void SampleTests_Valid() {
        assertEquals(1, HowManyUrinalsAreFree.getFreeUrinals("10001"));
        assertEquals(0, HowManyUrinalsAreFree.getFreeUrinals("1001"));
        assertEquals(3, HowManyUrinalsAreFree.getFreeUrinals("00000"));
        assertEquals(2, HowManyUrinalsAreFree.getFreeUrinals("0000"));
        assertEquals(1, HowManyUrinalsAreFree.getFreeUrinals("01000"));
        assertEquals(1, HowManyUrinalsAreFree.getFreeUrinals("00010"));
        assertEquals(2, HowManyUrinalsAreFree.getFreeUrinals("10000"));
        assertEquals(0, HowManyUrinalsAreFree.getFreeUrinals("1"));
        assertEquals(1, HowManyUrinalsAreFree.getFreeUrinals("0"));
        assertEquals(0, HowManyUrinalsAreFree.getFreeUrinals("10"));
    }

    @Test
    public void SampleTests_False() {
        assertEquals(-1, HowManyUrinalsAreFree.getFreeUrinals("110"));
        assertEquals(-1, HowManyUrinalsAreFree.getFreeUrinals("101100001"));
        assertEquals(-1, HowManyUrinalsAreFree.getFreeUrinals("0000100000101010011"));
    }
    
}
