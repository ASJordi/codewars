package kyu8;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringyStringsTest {

    @Test
    public void startTest() {
        assertEquals('1', StringyStrings.stringy(3).charAt(0), "Your string should start with a 1");
    }

    @Test
    public void lengthTests() {
        Random randGen = new Random();
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            assertEquals(size, StringyStrings.stringy(size).length(), "Wrong length using size " + size);
        }
    }

}
