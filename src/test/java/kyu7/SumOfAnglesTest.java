package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfAnglesTest {

    @Test
    public void sampleTests() {
        assertEquals(180, SumOfAngles.sumOfAngles(3));
        assertEquals(360, SumOfAngles.sumOfAngles(4));
    }

}
