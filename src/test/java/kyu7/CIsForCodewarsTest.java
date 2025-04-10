package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CIsForCodewarsTest {

    @Test
    void testSimpleCases() {
        assertEquals("CCCCC\nC\nC\nC\nCCCCC", CIsForCodewars.generateC(1));

        assertEquals(
                "CCCCCCCCCC\nCCCCCCCCCC\nCC\nCC\nCC\nCC\nCC\nCC\nCCCCCCCCCC\nCCCCCCCCCC",
                CIsForCodewars.generateC(2)
        );

        assertEquals(
                "CCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCC\nCCC\nCCC\nCCC\nCCC\nCCC\nCCC\nCCC\nCCC\nCCC\nCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCC",
                CIsForCodewars.generateC(3)
        );

        assertEquals(
                "CCCCCCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCCCCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCC\nCCCCCCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCCCCCCC\nCCCCCCCCCCCCCCCCCCCC",
                CIsForCodewars.generateC(4)
        );
    }

}
