package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertTimeToStringTest {

    @Test
    public void shouldConvertCorrectly() throws Exception {
        assertEquals("1 1 1 1", ConvertTimeToString.convertTime(90061));
        assertEquals("-1 -1 -1 -1", ConvertTimeToString.convertTime(-90061));
    }

}
