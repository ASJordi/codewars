package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SnailCrawlsUpTest {

    @Test
    public void basicTests() {
        assertEquals(2, SnailCrawlsUp.snail(3,2,1));
        assertEquals(5, SnailCrawlsUp.snail(10,3,1));
        assertEquals(8, SnailCrawlsUp.snail(10,3,2));
        assertEquals(7, SnailCrawlsUp.snail(100,20,5));
        assertEquals(1, SnailCrawlsUp.snail(5,10,3));
    }

}
