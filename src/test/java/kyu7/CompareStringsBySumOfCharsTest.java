package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareStringsBySumOfCharsTest {

    @Test
    public void BasicTests() {
        assertEquals(true, CompareStringsBySumOfChars.compare("AD", "BC"));
        assertEquals(false, CompareStringsBySumOfChars.compare("AD", "DD"));
    }

}
