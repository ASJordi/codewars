package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CompareStringsBySumOfCharsTest {

    @Test
    public void BasicTests() {
        assertEquals(true, CompareStringsBySumOfChars.compare("AD", "BC"));
        assertEquals(false, CompareStringsBySumOfChars.compare("AD", "DD"));
    }

}
