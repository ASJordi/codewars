package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupernaturalTest {

    @Test
    public void testBob() {
        assertEquals("Behead it with a machete, idjits!", Supernatural.bob("vampire"), "vampire");
        assertEquals("It depends on which one it is, idjits!", Supernatural.bob("pagan god"), "pagan god");
        assertEquals("I have friggin no idea yet, idjits!", Supernatural.bob("I have friggin no idea yet, idjits!"), "werepuppy");
    }

}
