package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateBMITest {

    @Test
    public void testBMI() {
        assertEquals("Normal", CalculateBMI.bmi(80, 1.80));
    }

}
