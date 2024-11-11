package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Fixme1234Test {

    @Test
    public void testEnglish() {
        assertEquals(1, Fixme1234.getNumber("one").intValue());
        assertEquals(2, Fixme1234.getNumber("two").intValue());
        assertEquals(3, Fixme1234.getNumber("three").intValue());
        assertEquals(4, Fixme1234.getNumber("four").intValue());
    }

    @Test
    public void testJapanese() {
        assertEquals(1, Fixme1234.getNumber("ichi").intValue());
        assertEquals(2, Fixme1234.getNumber("ni").intValue());
        assertEquals(3, Fixme1234.getNumber("san").intValue());
        assertEquals(4, Fixme1234.getNumber("shi").intValue());
    }

    @Test
    public void testFrench() {
        assertEquals(1, Fixme1234.getNumber("un").intValue());
        assertEquals(2, Fixme1234.getNumber("deux").intValue());
        assertEquals(3, Fixme1234.getNumber("trois").intValue());
        assertEquals(4, Fixme1234.getNumber("quatre").intValue());
    }

}
