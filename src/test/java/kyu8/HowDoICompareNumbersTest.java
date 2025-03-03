package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowDoICompareNumbersTest {

    static final Object[][] tests = {
            {0, "nothing"},
            {123, "nothing"},
            {-1, "nothing"},
            {42, "everything"},
            {42 * 42, "everything squared"},
    };

    @Test
    public void test() throws Exception {
        for (Object[] t : tests)
            assertEquals(t[1], HowDoICompareNumbers.whatIs((Integer) t[0]));
    }

}
