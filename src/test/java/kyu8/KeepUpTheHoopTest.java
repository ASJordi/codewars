package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeepUpTheHoopTest {

    @Test
    public void testHoopCount() {
        assertEquals("Great, now move on to tricks", KeepUpTheHoop.hoopCount(11));
        assertEquals("Keep at it until you get it", KeepUpTheHoop.hoopCount(7));
    }

}
