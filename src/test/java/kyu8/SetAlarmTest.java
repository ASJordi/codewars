package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetAlarmTest {

    @Test
    public void setAlarmTest() {
        assertTrue(SetAlarm.setAlarm(true, false), "Should be true.");
        assertFalse(SetAlarm.setAlarm(true, true), "Should be false.");
        assertFalse(SetAlarm.setAlarm(false, false), "Should be false.");
        assertFalse(SetAlarm.setAlarm(false, true), "Should be false.");
    }

}
