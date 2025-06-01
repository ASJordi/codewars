package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersWithThisDigitInsideTest {

    @Test
    public void BasicTests() {
	assertArrayEquals(new long[] { 0, 0, 0 }, NumbersWithThisDigitInside.NumbersWithDigitInside(5, 6));
	assertArrayEquals(new long[] { 1, 6, 6 }, NumbersWithThisDigitInside.NumbersWithDigitInside(7, 6));
	assertArrayEquals(new long[] { 3, 22, 110 }, NumbersWithThisDigitInside.NumbersWithDigitInside(11, 1));
	assertArrayEquals(new long[] { 2, 30, 200 }, NumbersWithThisDigitInside.NumbersWithDigitInside(20, 0));
	assertArrayEquals(new long[] { 9, 286, 5955146588160L }, NumbersWithThisDigitInside.NumbersWithDigitInside(44, 4));
    }

}
