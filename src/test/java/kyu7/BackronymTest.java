package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackronymTest {

    @Test
    public void basicTest(){
        assertEquals("disturbing gregarious mustache", Backronym.makeBackronym("dgm"));
        assertEquals("literal klingon joke", Backronym.makeBackronym("lkj"));
    }
}
