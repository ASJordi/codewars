package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheWideMouthedFrogTest {

    @Test
    public void basicTests() {
        assertEquals("wide", TheWideMouthedFrog.mouthSize("toucan"));
        assertEquals("wide",TheWideMouthedFrog.mouthSize("ant bear"));
        assertEquals("small", TheWideMouthedFrog.mouthSize("alligator"));
    }

}
