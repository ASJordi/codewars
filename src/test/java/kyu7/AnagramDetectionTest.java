package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramDetectionTest {

    @Test
    public void exampleTests() {
        AnagramDetection k = new AnagramDetection();

        assertTrue(AnagramDetection.isAnagram("foefet", "toffee"));
        assertTrue(AnagramDetection.isAnagram("Buckethead", "DeathCubeK"));
        assertTrue(AnagramDetection.isAnagram("Twoo", "Woot"));
        assertFalse(AnagramDetection.isAnagram("apple", "pale"));
    }

}
