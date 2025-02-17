package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DoubleSortTest {

    @Test
    public void test1() {
        Object[] a = new Integer[]{6, 2, 3, 4, 5};
        Object[] expResult = new Integer[]{2, 3, 4, 5, 6};
        Object[] result = DoubleSort.dbSort(a);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void test2() {
        Object[] a = new Integer[]{14, 32, 3, 5, 5};
        Object[] expResult = new Integer[]{3, 5, 5, 14, 32};
        Object[] result = DoubleSort.dbSort(a);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void test3() {
        Object[] a = new Object[]{"Banana", "Orange", "Apple", "Mango", 0, 2, 2};
        Object[] expResult = new Object[]{0, 2, 2, "Apple", "Banana", "Mango", "Orange"};
        Object[] result = DoubleSort.dbSort(a);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void test4() {
        Object[] a = new Object[]{"C", "W", "W", "W", 1, 2, 0};
        Object[] expResult = new Object[]{0, 1, 2, "C", "W", "W", "W"};
        Object[] result = DoubleSort.dbSort(a);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void test5() {
        Object[] a = new Object[]{"Apple", 46, "287", 574, "Peach", "3", "69", 78, "Grape", "423"};
        Object[] expResult = new Object[]{46, 78, 574, "287", "3", "423", "69", "Apple", "Grape", "Peach"};
        Object[] result = DoubleSort.dbSort(a);
        assertArrayEquals(expResult, result);
    }
}