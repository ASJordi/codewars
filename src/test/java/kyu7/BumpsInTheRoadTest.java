package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BumpsInTheRoadTest {

    @Test
    public void basicTest() {
        assertEquals("Woohoo!", BumpsInTheRoad.bumps("n"));
        assertEquals("Woohoo!", BumpsInTheRoad.bumps("__nn_nnnn__n_n___n____nn__nnn"));
        assertEquals("Woohoo!", BumpsInTheRoad.bumps("nnn_n__n_n___nnnnn___n__nnn__"));
        assertEquals("Car Dead", BumpsInTheRoad.bumps("_nnnnnnn_n__n______nn__nn_nnn"));
        assertEquals("Woohoo!", BumpsInTheRoad.bumps("______n___n_"));
        assertEquals("Car Dead", BumpsInTheRoad.bumps("nnnnnnnnnnnnnnnnnnnnn"));
    }

}
