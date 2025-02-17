package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeypadHorrorTest {

    @Test
    public void basicTest() {
        assertEquals("For input \"0789456123\"", "0123456789", KeypadHorror.computerToPhone("0789456123"));
        assertEquals("For input \"000\"", "000", KeypadHorror.computerToPhone("000"));
        assertEquals("For input \"94561\"", "34567", KeypadHorror.computerToPhone("94561"));
        assertEquals("For empty input", "", KeypadHorror.computerToPhone(""));
    }

}
