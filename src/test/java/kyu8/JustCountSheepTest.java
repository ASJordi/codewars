package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JustCountSheepTest {

    @Test
    public void testSomeCases() {
        assertEquals("", JustCountSheep.countingSheep(0));
        assertEquals("1 sheep...", JustCountSheep.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", JustCountSheep.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", JustCountSheep.countingSheep(3));
    }

}
