package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowManyDaysAreWeRepresentedInAForeignCountryTest {

    @Test
    public void testRepresentation() {
        assertEquals(17, HowManyDaysAreWeRepresentedInAForeignCountry.daysRepresented(new int[][] {{10,15},{25,35}}));
        assertEquals(24, HowManyDaysAreWeRepresentedInAForeignCountry.daysRepresented(new int[][] {{2,8},{220,229},{10,16}}));
    }

}
