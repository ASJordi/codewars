package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NicknameGeneratorTest {

    @Test
    public void testSomething() {
        assertEquals("Jim", NicknameGenerator.nickname("Jimmy"));
        assertEquals("Sam", NicknameGenerator.nickname("Samantha"));
        assertEquals("Error: Name too short", NicknameGenerator.nickname("Sam"));
        assertEquals("Kay", NicknameGenerator.nickname("Kayne"));
        assertEquals("Mel", NicknameGenerator.nickname("Melissa"));
        assertEquals("Jam", NicknameGenerator.nickname("James"));
    }

}
