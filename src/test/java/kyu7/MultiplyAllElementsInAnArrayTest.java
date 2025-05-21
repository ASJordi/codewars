package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyAllElementsInAnArrayTest {

    @Test
    public void isArray() {
        assertEquals(int[].class, MultiplyAllElementsInAnArray.multiplyAll(new int[]{1}).apply(1).getClass());
    }

    @Test
    public void hasCorrectLength() {
        assertEquals(2, MultiplyAllElementsInAnArray.multiplyAll(new int[]{1, 2}).apply(1).length);
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3}, MultiplyAllElementsInAnArray.multiplyAll(new int[]{1, 2, 3}).apply(1));
        assertArrayEquals(new int[]{2, 4, 6}, MultiplyAllElementsInAnArray.multiplyAll(new int[]{1, 2, 3}).apply(2));
        assertArrayEquals(new int[]{0, 0, 0}, MultiplyAllElementsInAnArray.multiplyAll(new int[]{1, 2, 3}).apply(0));
        assertArrayEquals(new int[0], MultiplyAllElementsInAnArray.multiplyAll(new int[0]).apply(10), "should return an empty array");
    }

}
