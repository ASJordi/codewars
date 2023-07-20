package kyu8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GhostCodeTest {

    @Test
    public void exampleTests() {
        String result = GhostCode.helloName("Javatlacati");
        assertEquals("Hello my name is Javatlacati is not " + result,"Hello my name is Javatlacati", result);
    }

}
