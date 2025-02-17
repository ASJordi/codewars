package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReturnTheFirstMMultiplesOfNTest {

    @Test
    public void tests() {
        assertArrayEquals(new int[]{5, 10, 15}, ReturnTheFirstMMultiplesOfN.multiples(3, 5));
    }

}
