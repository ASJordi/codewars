package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChineseZodiacTest {

    @Test
    public void exampleTests() {
        assertEquals("Wood Snake", "Wood Snake", ChineseZodiac.chineseZodiac(1965));
        assertEquals("Earth Tiger", "Earth Tiger", ChineseZodiac.chineseZodiac(1938));
        assertEquals("Wood Rat", "Wood Rat", ChineseZodiac.chineseZodiac(1924));
        assertEquals("Earth Monkey", "Earth Monkey", ChineseZodiac.chineseZodiac(1968));
        assertEquals("Earth Tiger", "Earth Tiger", ChineseZodiac.chineseZodiac(1998));
        assertEquals("Fire Monkey", "Fire Monkey", ChineseZodiac.chineseZodiac(2016));
        assertEquals("Water Dog", "Water Dog", ChineseZodiac.chineseZodiac(2162));
    }

}
