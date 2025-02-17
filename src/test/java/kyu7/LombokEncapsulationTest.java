package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
