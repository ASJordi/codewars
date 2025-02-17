package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheStrayNumberTest {

    @Test
    void threeElements1() {
        assertEquals(2, getActualFor(2, 1, 1));
    }

    @Test
    void threeElements2() {
        assertEquals(2, getActualFor(1, 2, 1));
    }

    @Test
    void threeElements3() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    private int getActualFor(int... numbers) {
        return FindTheStrayNumber.stray(numbers);
    }

}
