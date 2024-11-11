package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindMultiplesOfANumberTest {

    @Test
    public void testExamples() {
        assertArrayEquals("Testing for base=5 and limit=25", new int[] { 5, 10, 15, 20, 25 }, FindMultiplesOfANumber.find(5, 25));
        assertArrayEquals("Testing for base=1 and limit=2", new int[] { 1, 2 }, FindMultiplesOfANumber.find(1, 2));
        assertArrayEquals("Testing for base=5 and limit=7", new int[] { 5 }, FindMultiplesOfANumber.find(5, 7));
        assertArrayEquals("Testing for base=4 and limit=27", new int[] { 4, 8, 12, 16, 20, 24 }, FindMultiplesOfANumber.find(4, 27));
        assertArrayEquals("Testing for base=11 and limit=54", new int[] { 11, 22, 33, 44 }, FindMultiplesOfANumber.find(11, 54));
    }

}
