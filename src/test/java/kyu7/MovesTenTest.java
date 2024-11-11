package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovesTenTest {

    @Test
    public void sampleTests() {
        assertEquals("docdmkco", MovesTen.moveTen("testcase"));
        assertEquals("mynogkbc", MovesTen.moveTen("codewars"));
        assertEquals("ohkwzvodocdrobo", MovesTen.moveTen("exampletesthere"));
    }

}
