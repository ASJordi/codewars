package kyu8;

import org.junit.jupiter.api.Test;

import java.util.function.IntPredicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrueForAllTest {

    private static final IntPredicate evenNumber = n -> n % 2 == 0;
    private static final IntPredicate oddNumber = n -> n % 2 != 0;
    private static final IntPredicate lessThan10 = n -> n < 10;
    private static final IntPredicate lessThan5 = n -> n < 5;
    private static final IntPredicate greaterThan1 = n -> n > 1;
    private static final IntPredicate greaterThan5 = n -> n > 5;
    private static final IntPredicate greaterThan10 = n -> n > 10;

    @Test
    public void fixedTests() {
        assertTrue(TrueForAll.all(new int[]{2, 4, 6, 10}, evenNumber));
        assertFalse(TrueForAll.all(new int[]{1, 3, 5, 10}, oddNumber));
        assertFalse(TrueForAll.all(new int[]{2, 4, 6, 19}, lessThan10));
        assertTrue(TrueForAll.all(new int[]{1, 1, 2}, lessThan5));
        assertTrue(TrueForAll.all(new int[]{2, 9, 4, 3}, greaterThan1));
        assertFalse(TrueForAll.all(new int[]{2, 9, 4, 0}, greaterThan1));
        assertFalse(TrueForAll.all(new int[]{5, 6, 7, 8}, greaterThan5));
        assertTrue(TrueForAll.all(new int[]{13, 42}, greaterThan10));

        assertFalse(TrueForAll.all(new int[]{5}, evenNumber));
        assertTrue(TrueForAll.all(new int[]{5}, oddNumber));
        assertFalse(TrueForAll.all(new int[]{5}, lessThan5));

        assertTrue(TrueForAll.all(new int[]{}, evenNumber));
        assertTrue(TrueForAll.all(new int[]{}, lessThan5));
        assertTrue(TrueForAll.all(new int[]{}, greaterThan10));
    }

}
