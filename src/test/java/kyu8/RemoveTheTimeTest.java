package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveTheTimeTest {

    @Test
    public void sampleTests() {
        assertEquals("Failed for input: \"Friday May 2, 9am\"", "Friday May 2", RemoveTheTime.shortenToDate("Friday May 2, 9am"));
        assertEquals("Failed for input: \"Tuesday January 29, 10pm\"", "Tuesday January 29", RemoveTheTime.shortenToDate("Tuesday January 29, 10pm"));
        assertEquals("Failed for input: \"Monday December 25, 10pm\"", "Monday December 25", RemoveTheTime.shortenToDate("Monday December 25, 10pm"));
    }

}
