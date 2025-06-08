package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordSystemTest {

    @Test
    void VS_ZOOM() {
        doTest(new int[]{1,1,0,1,0,0,0,1,1,0,0,0,1,0,1,1}, "Yes");
        doTest(new int[]{1,1,0,0,0,0,1,1,0}, "No");
    }

    private void doTest(final int[] key, final String expected) {
        assertEquals(expected, PasswordSystem.helpZoom(key));
    }

}
