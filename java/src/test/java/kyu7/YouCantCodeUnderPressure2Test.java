package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class YouCantCodeUnderPressure2Test {

    @Test
    public void Sample_Tests() {
        YouCantCodeUnderPressure2 mycounter = new YouCantCodeUnderPressure2();

        mycounter.increment();
        mycounter.increment();
        assertEquals(2, mycounter.check());
    }

}
