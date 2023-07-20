package kyu8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

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
