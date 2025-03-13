package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GhostbustersWhitespaceRemovalTest {

    @Test
    public void test1() {
        assertEquals("Factory", GhostbustersWhitespaceRemoval.ghostBusters("Factor y"));
    }

    @Test
    public void test2() {
        assertEquals("Office", GhostbustersWhitespaceRemoval.ghostBusters("O  f fi ce"));
    }

    @Test
    public void test3() {
        assertEquals("You just wanted my autograph didn't you?", GhostbustersWhitespaceRemoval.ghostBusters("BusStation"));
    }

}
