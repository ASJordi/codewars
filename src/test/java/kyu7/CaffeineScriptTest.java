package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaffeineScriptTest {

    @Test
    public void basicTest() {
        assertEquals("mocha_missing!", CaffeineScript.caffeineBuzz(1));
        assertEquals("Java", CaffeineScript.caffeineBuzz(3));
        assertEquals("JavaScript", CaffeineScript.caffeineBuzz(6));
        assertEquals("CoffeeScript", CaffeineScript.caffeineBuzz(12));
    }

}
