package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeypadHorrorTest {

    @Test
    public void basicTest() {
        assertEquals("0123456789", KeypadHorror.computerToPhone("0789456123"));
        assertEquals("000", KeypadHorror.computerToPhone("000"));
        assertEquals("34567", KeypadHorror.computerToPhone("94561"));
        assertEquals("", KeypadHorror.computerToPhone(""));
    }

}
