package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintingArrayElementsWithCommaDelimitersTest {

    @Test
    public void testInteger() {
        Integer[] array = new Integer[]{2, 4, 5, 2};
        assertEquals("2,4,5,2", PrintingArrayElementsWithCommaDelimiters.printArray(array));
    }

}
