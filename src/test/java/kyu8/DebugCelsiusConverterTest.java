package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebugCelsiusConverterTest {

    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", DebugCelsiusConverter.weatherInfo(50));
    }

    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", DebugCelsiusConverter.weatherInfo(23));
    }

}
