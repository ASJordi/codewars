package easy;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DidSheSayHalloTest {

    @Test
    public void testSomething() {
        assertTrue(DidSheSayHallo.validateHello("hello"));
        assertTrue(DidSheSayHallo.validateHello("ciao bella!"));
        assertTrue(DidSheSayHallo.validateHello("salut"));
        assertTrue(DidSheSayHallo.validateHello("hallo, salut"));
        assertTrue(DidSheSayHallo.validateHello("hombre! Hola!"));
        assertTrue(DidSheSayHallo.validateHello("Hallo, wie geht's dir?"));
        assertTrue(DidSheSayHallo.validateHello("AHOJ!"));
        assertTrue(DidSheSayHallo.validateHello("czesc"));
        assertTrue(DidSheSayHallo.validateHello("Ahoj"));
        assertFalse(DidSheSayHallo.validateHello("meh"));
    }

}
