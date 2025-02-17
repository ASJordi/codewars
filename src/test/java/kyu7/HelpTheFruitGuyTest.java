package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
