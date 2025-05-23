package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class WhatIsBetweenTest {

    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, WhatIsBetween.between(1, 4));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, WhatIsBetween.between(-2, 2));
    }

}
