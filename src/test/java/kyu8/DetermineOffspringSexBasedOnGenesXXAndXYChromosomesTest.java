package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DetermineOffspringSexBasedOnGenesXXAndXYChromosomesTest {

    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", DetermineOffspringSexBasedOnGenesXXAndXYChromosomes.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", DetermineOffspringSexBasedOnGenesXXAndXYChromosomes.chromosomeCheck("XX"));
    }

}
