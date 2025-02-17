package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CatYearsDogYearsTest {

    @Test
    public void one() {
        assertArrayEquals(new int[]{1,1}, CatYearsDogYears.ownedCatAndDog(15,15));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2,2}, CatYearsDogYears.ownedCatAndDog(24,24));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10,10}, CatYearsDogYears.ownedCatAndDog(56,64));
    }

}
