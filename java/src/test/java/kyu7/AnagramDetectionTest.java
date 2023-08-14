package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class AnagramDetectionTest {

    @Test
    public void exampleTests() {
        AnagramDetection k = new AnagramDetection();

        assertEquals(true, k.isAnagram("foefet", "toffee"));
        assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
        assertEquals(true, k.isAnagram("Twoo", "Woot"));
        assertEquals(false, k.isAnagram("apple", "pale"));
    }

}
