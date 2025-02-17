package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountOddNumbersBelowNTest {

    @Test
    public void fixedTests() {
        assertEquals(7, CountOddNumbersBelowN.oddCount(15));
        assertEquals(7511, CountOddNumbersBelowN.oddCount(15023));
    }

}
