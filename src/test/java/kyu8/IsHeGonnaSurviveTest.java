package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsHeGonnaSurviveTest {

    @Test
    public void aTrueHero() {
        assertTrue(IsHeGonnaSurvive.hero(10, 5));
        assertTrue(IsHeGonnaSurvive.hero(100, 40));
    }

    @Test
    public void aFalseHero() {
        assertFalse(IsHeGonnaSurvive.hero(4, 5));
        assertFalse(IsHeGonnaSurvive.hero(1500, 751));
        assertFalse(IsHeGonnaSurvive.hero(0, 1));
        assertFalse(IsHeGonnaSurvive.hero(7, 4));
    }

    @Test
    public void isHeAHero() {
        assertFalse(IsHeGonnaSurvive.hero(1757275535, 1715581957 ));
    }

}
