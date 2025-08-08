package kyu7;

import org.junit.jupiter.api.Test;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class URLTimestampsTest {

    @Test
    public void testCodewars() throws Exception {
        URLTimestamps map = new URLTimestamps();
        URL url1 = new URL("http://www.codewars.com/");
        long time1 = 12345L;

        URL url2 = new URL("http://www.codewars.com/kata/url-timestamps/");
        long time2 = 67890L;

        map.setTimestamp(url1, time1);
        map.setTimestamp(url2, time2);

        assertEquals(time1, map.getTimestamp(url1));
        assertEquals(time2, map.getTimestamp(url2));
    }

    @Test
    public void testNew() throws Exception {
        URLTimestamps map = new URLTimestamps();

        URL url1 = new URL("http://www.codewars.com/");
        URL url2 = new URL("http://www.codewars.com/kata/url-timestamps/");

        assertEquals(-1, map.getTimestamp(url1));
        assertEquals(-1, map.getTimestamp(url2));
    }

}
