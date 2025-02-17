package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveTheTimeTest {

    @Test
    public void sampleTests() {
        assertEquals("Friday May 2", RemoveTheTime.shortenToDate("Friday May 2, 9am"));
        assertEquals("Tuesday January 29", RemoveTheTime.shortenToDate("Tuesday January 29, 10pm"));
        assertEquals("Monday December 25", RemoveTheTime.shortenToDate("Monday December 25, 10pm"));
    }

}
