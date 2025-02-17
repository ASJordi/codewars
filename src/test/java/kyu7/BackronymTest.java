package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackronymTest {

    @Test
    public void basicTest() {
        assertEquals("disturbing gregarious mustache", Backronym.makeBackronym("dgm"));
        assertEquals("literal klingon joke", Backronym.makeBackronym("lkj"));
    }
}
