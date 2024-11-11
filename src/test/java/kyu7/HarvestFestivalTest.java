package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HarvestFestivalTest {

    @Test
    public void sampleTests() {
        assertEquals("---,,,,,,,---,,,,,,,---,,,,,,,", HarvestFestival.plant(',', 3, 7, 25));
        assertEquals("-+", HarvestFestival.plant('+', 1, 3, 15));
        assertEquals("---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;", HarvestFestival.plant(';', 9, 10, 30));
    }

}
