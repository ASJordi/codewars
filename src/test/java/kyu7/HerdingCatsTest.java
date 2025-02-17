package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HerdingCatsTest {

    @Test
    public void testSimpleCase() {
        HerdingCats.Cat[] cats = new HerdingCats.Cat[2];
        cats[0] = new HerdingCats.Cat("Lily", 30);
        cats[1] = new HerdingCats.Cat("Drake", 15);

        Arrays.sort(cats, new HerdingCats());

        assertEquals("Drake", cats[0].name);
        assertEquals("Lily", cats[1].name);
    }

}


