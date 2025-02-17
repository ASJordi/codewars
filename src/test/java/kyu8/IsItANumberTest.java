package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsItANumberTest {

    IsItANumber myUtil = new IsItANumber();

    @Test
    public void test0() throws Exception {
        assertFalse(myUtil.isDigit("s2324"));
    }

    @Test
    public void test1() throws Exception {
        assertTrue(myUtil.isDigit("-234.4"));
    }

}
