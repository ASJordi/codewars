package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InvisibleCubesTest {

    @Test
    void fixedTest() {
        InvisibleCubes kata = new InvisibleCubes();
        assertEquals(Long.valueOf(0L), kata.notVisibleCubes(0L), "should work for 0");
        assertEquals(Long.valueOf(0L), kata.notVisibleCubes(1L), "should work for 1");
        assertEquals(Long.valueOf(0L), kata.notVisibleCubes(2L), "should work for 2");
        assertEquals(Long.valueOf(1L), kata.notVisibleCubes(3L), "should work for 3");
        assertEquals(Long.valueOf(27L), kata.notVisibleCubes(5L), "should work for 5");
    }

}
