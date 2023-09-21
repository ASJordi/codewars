package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelpTheFruitGuyTest {

    @Test
    public void testEmptyFruit() {
        assertTrue(HelpTheFruitGuy.removeRotten(new String[0]).length == 0);
    }

    @Test
    public void testAllRottenArray() {
        String[] rotten = new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"};
        String [] expected = new String []{"apple","banana","apple","pineapple","kiwi"};
        assertArrayEquals(expected, HelpTheFruitGuy.removeRotten(rotten));
    }

}
