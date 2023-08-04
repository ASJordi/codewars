package kyu7;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CaffeineScriptTest {

    @Test
    public void basicTest(){
            assertEquals("mocha_missing!", CaffeineScript.caffeineBuzz(1));
            assertEquals("Java", CaffeineScript.caffeineBuzz(3));
            assertEquals("JavaScript", CaffeineScript.caffeineBuzz(6));
            assertEquals("CoffeeScript", CaffeineScript.caffeineBuzz(12));
    }

}
