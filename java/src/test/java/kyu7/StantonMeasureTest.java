package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StantonMeasureTest {

    @Test
    public void sampleTests() {
        assertEquals(3, StantonMeasure.stantonMeasure(new int[] {1, 4, 3, 2, 1, 2, 3, 2}));
    }

}
