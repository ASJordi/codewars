package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficLightsTest {

    @Test
    public void update_light() {
        assertEquals("green", TrafficLights.updateLight("red"));
        assertEquals("yellow", TrafficLights.updateLight("green"));
        assertEquals("red", TrafficLights.updateLight("yellow"));
    }

}
