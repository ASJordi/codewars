package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MakeMeSlowTest {

    @Test
    public void ActualTest() {
        long time = System.currentTimeMillis();
        MakeMeSlow.makeMeSlow();
        long timeTaken = System.currentTimeMillis() - time;
        assertTrue(timeTaken >= 7000, "Time taken was " + timeTaken/1000 + " seconds: Must take at least 7 seconds!");
    }

}
