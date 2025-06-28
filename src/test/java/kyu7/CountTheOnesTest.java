package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTheOnesTest {

    @Test
    void testSomething() {
        assertEquals(2, CountTheOnes.hammingWeight(10));
        assertEquals(3, CountTheOnes.hammingWeight(21));
    }

}
