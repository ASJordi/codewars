package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrueOrFalseTest {

    @Test
    public void exampleTests1() {
        // n?
        assertEquals(0, TrueOrFalse.testTrueFalse(0));
        assertEquals(1, TrueOrFalse.testTrueFalse(1));
    }

    @Test
    public void exampleTests2() {
        // n - 1?
        assertEquals(1, TrueOrFalse.testTrueFalse(2));
        assertEquals(2, TrueOrFalse.testTrueFalse(3));
    }

    @Test
    public void exampleTests3() {
        // round(n / 3f)?
        assertEquals(1, TrueOrFalse.testTrueFalse(4));
        assertEquals(2, TrueOrFalse.testTrueFalse(5));
        assertEquals(2, TrueOrFalse.testTrueFalse(6));
    }

    @Test
    public void exampleTests4() {
        // none of the above?
        assertEquals(3, TrueOrFalse.testTrueFalse(7));
        assertEquals(1, TrueOrFalse.testTrueFalse(8));
        assertEquals(2, TrueOrFalse.testTrueFalse(9));
        assertEquals(2, TrueOrFalse.testTrueFalse(10));
        assertEquals(3, TrueOrFalse.testTrueFalse(100));
        assertEquals(6, TrueOrFalse.testTrueFalse(1000));
        assertEquals(5, TrueOrFalse.testTrueFalse(10000));
    }

}
