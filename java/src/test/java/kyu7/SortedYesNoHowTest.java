package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SortedYesNoHowTest {

    @Test
    public void test1() {
        int[] array = new int[] {1, 2};
        assertEquals("yes, ascending", SortedYesNoHow.isSortedAndHow(array));
    }

    @Test
    public void test2() {
        int[] array = new int[] {15, 7, 3, -8};
        assertEquals("yes, descending", SortedYesNoHow.isSortedAndHow(array));
    }

    @Test
    public void test3() {
        int[] array = new int[] {4, 2, 30};
        assertEquals("no", SortedYesNoHow.isSortedAndHow(array));
    }

}
