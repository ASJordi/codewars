package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelSheetColumnNumbersTest {

    @Test
    public void test0() {
        System.out.println("Fixed Tests");
        assertEquals(1, ExcelSheetColumnNumbers.titleToNumber("A"));
        assertEquals(27, ExcelSheetColumnNumbers.titleToNumber("AA"));
        assertEquals(52, ExcelSheetColumnNumbers.titleToNumber("AZ"));
        assertEquals(53, ExcelSheetColumnNumbers.titleToNumber("BA"));
        assertEquals(28779382963L, ExcelSheetColumnNumbers.titleToNumber("CODEWARS"));
    }

}
