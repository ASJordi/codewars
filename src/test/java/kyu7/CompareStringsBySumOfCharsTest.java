package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompareStringsBySumOfCharsTest {

    @Test
    public void BasicTests() {
        assertTrue(CompareStringsBySumOfChars.compare("AD", "BC"));
        assertFalse(CompareStringsBySumOfChars.compare("AD", "DD"));
    }

}
