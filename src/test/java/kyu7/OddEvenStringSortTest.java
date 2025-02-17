package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddEvenStringSortTest {

    @Test
    public void testSomething() {
        assertEquals("Wleclgltihuebredrf ofsheesenasnegrof", OddEvenStringSort.sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
        assertEquals("MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY", OddEvenStringSort.sortMyString("METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"));
        assertEquals("PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI", OddEvenStringSort.sortMyString("PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"));
        assertEquals("PEDPEDHPPRTYODS SUOSUOYOAAHRIIM", OddEvenStringSort.sortMyString("PSEUDOPSEUDOHYPOPARATHYROIDISM"));
        assertEquals("FOCNUIIIIIIIAIN LCIACNHLPLFCTO", OddEvenStringSort.sortMyString("FLOCCINAUCINIHILIPILIFICATION"));
        assertEquals("SBEMTGYHC UDRAOLPI", OddEvenStringSort.sortMyString("SUBDERMATOGLYPHIC"));
    }

}
