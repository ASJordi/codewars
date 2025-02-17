package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CatYearsDogYearsTest {

    @Test
    public void oneHumanYear() {
        assertArrayEquals(new int[]{1,15,15}, CatYearsDogYears.humanYearsCatYearsDogYears(1));
    }

    @Test
    public void twoHumanYears() {
        assertArrayEquals(new int[]{2,24,24}, CatYearsDogYears.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void tenHumanYears() {
        assertArrayEquals(new int[]{10,56,64}, CatYearsDogYears.humanYearsCatYearsDogYears(10));
    }

}
