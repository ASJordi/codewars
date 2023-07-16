package kyu8;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.assertEquals;

public class PillarsTest {

    @Test
    public void thereIsOnlyOnePillar() {
        assertEquals(0, Pillars.pillars(1,10,10));
    }

    @Test
    public void thereAreTwoPillarsOnTheRoad() {
        assertEquals(2000, Pillars.pillars(2,20,25));
    }

    @Test
    public void thereAreManyPillarsAlongTheRoad() {
        assertEquals(15270, Pillars.pillars(11,15,30));
    }

    @Test
    public void numberOfPillarsShouldBeGreaterThanZero() {
        assertThatThrownBy(() -> Pillars.pillars(0, 0, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Number of pillars must be greater than 0");
    }

}
