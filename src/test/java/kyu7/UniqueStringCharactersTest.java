package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueStringCharactersTest {

    @Test
    public void basicTests(){
        assertEquals("ybzc", UniqueStringCharacters.solve("xyab","xzca"));
        assertEquals("ybbzc", UniqueStringCharacters.solve("xyabb","xzca"));
        assertEquals("abcdxyz", UniqueStringCharacters.solve("abcd","xyz"));
        assertEquals("zca", UniqueStringCharacters.solve("xxx","xzca"));
    }

}
