package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;


public class HerdingCatsTest {

    @Test
    public void testSimpleCase()
    {
        HerdingCats.Cat[] cats = new HerdingCats.Cat[2];
        cats[0] = new HerdingCats.Cat("Lily", 30);
        cats[1] = new HerdingCats.Cat("Drake", 15);

        Arrays.sort(cats, new HerdingCats());

        assertEquals("Incorrect cat found at index 0", "Drake", cats[0].name);
        assertEquals("Incorrect cat found at index 1", "Lily", cats[1].name);
    }

}


