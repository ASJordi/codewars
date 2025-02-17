package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertAStringToANumberTest {

    @Test
    public void test1() {
        assertEquals(1234, ConvertAStringToANumber.stringToNumber("1234"), "stringToNumber(1234)");
    }

    @Test
    public void test2() {
        assertEquals(605, ConvertAStringToANumber.stringToNumber("605"), "stringToNumber(605)");
    }

    @Test
    public void test3() {
        assertEquals(1405, ConvertAStringToANumber.stringToNumber("1405"), "stringToNumber(1405)");
    }

    @Test
    public void test4() {
        assertEquals(-7, ConvertAStringToANumber.stringToNumber("-7"), "stringToNumber(-7)");
    }

}
