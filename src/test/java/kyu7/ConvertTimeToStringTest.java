package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertTimeToStringTest {

    @Test
    public void shouldConvertCorrectly() throws Exception {
        assertEquals("1 1 1 1", ConvertTimeToString.convertTime(90061));
        assertEquals("-1 -1 -1 -1", ConvertTimeToString.convertTime(-90061));
    }

}
