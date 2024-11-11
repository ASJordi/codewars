package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TheWideMouthedFrogTest {

    @Test
    public void basicTests() {
        assertEquals("wide", TheWideMouthedFrog.mouthSize("toucan"));
        assertEquals("wide",TheWideMouthedFrog.mouthSize("ant bear"));
        assertEquals("small", TheWideMouthedFrog.mouthSize("alligator"));
    }

}
