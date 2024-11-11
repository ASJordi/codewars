package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.security.SecureRandom;
import java.math.BigInteger;

public class LombokEncapsulationTest {

    @Test
    public void testSample() {
        LombokEncapsulation ed = new LombokEncapsulation();
        assertEquals(
                0,
                ed.getNumber()
        );
    }

}
