package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetCharacterFromASCIIValueTest {

    @Test
    public void testChar() {
        assertEquals('7', GetCharacterFromASCIIValue.getChar(55));
        assertEquals('8', GetCharacterFromASCIIValue.getChar(56));
        assertEquals('9', GetCharacterFromASCIIValue.getChar(57));
        assertEquals(':', GetCharacterFromASCIIValue.getChar(58));
        assertEquals(';', GetCharacterFromASCIIValue.getChar(59));
        assertEquals('<', GetCharacterFromASCIIValue.getChar(60));
        assertEquals('=', GetCharacterFromASCIIValue.getChar(61));
        assertEquals('>', GetCharacterFromASCIIValue.getChar(62));
        assertEquals('?', GetCharacterFromASCIIValue.getChar(63));
        assertEquals('@', GetCharacterFromASCIIValue.getChar(64));
        assertEquals('A', GetCharacterFromASCIIValue.getChar(65));
        assertEquals(0, Character.compare('!', GetCharacterFromASCIIValue.getChar(33)), "getChar should return a `char`");
    }

}
