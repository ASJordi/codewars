package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrinterErrorsTest {

    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", PrinterErrors.printerError(s));
    }

}
