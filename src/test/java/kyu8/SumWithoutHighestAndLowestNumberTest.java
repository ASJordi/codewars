package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumWithoutHighestAndLowestNumberTest {

    @Test
    public void BasicTests() {
        assertEquals(16, SumWithoutHighestAndLowestNumber.sum(new int[] { 6, 2, 1, 8, 10}));
    }

}
