package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

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
