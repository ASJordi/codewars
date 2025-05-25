package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NoIfsNoButsTest {

    @Test
    void basicTest() {
        assertEquals("45 is smaller than 51", NoIfsNoButs.noIfsNoButs(45, 51));
        assertEquals("1 is smaller than 2", NoIfsNoButs.noIfsNoButs(1, 2));
        assertEquals("-3 is smaller than 2", NoIfsNoButs.noIfsNoButs(-3, 2));
        assertEquals("1 is equal to 1", NoIfsNoButs.noIfsNoButs(1,1));
        assertEquals("100 is equal to 100", NoIfsNoButs.noIfsNoButs(100,100));
        assertEquals("100 is greater than 80", NoIfsNoButs.noIfsNoButs(100,80));
        assertEquals("20 is greater than 19", NoIfsNoButs.noIfsNoButs(20,19));
    }

}
