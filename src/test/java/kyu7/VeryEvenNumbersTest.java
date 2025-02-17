package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeryEvenNumbersTest {

    @Test
    public void sampleTests() {
        assertEquals(true, VeryEvenNumbers.isVeryEvenNumber(0));
        assertEquals(true, VeryEvenNumbers.isVeryEvenNumber(4));
        assertEquals(false, VeryEvenNumbers.isVeryEvenNumber(12));
        assertEquals(true, VeryEvenNumbers.isVeryEvenNumber(222));
        assertEquals(false, VeryEvenNumbers.isVeryEvenNumber(5));
        assertEquals(false, VeryEvenNumbers.isVeryEvenNumber(45));
        assertEquals(false, VeryEvenNumbers.isVeryEvenNumber(4554));
        assertEquals(false, VeryEvenNumbers.isVeryEvenNumber(1234));
        assertEquals(false, VeryEvenNumbers.isVeryEvenNumber(88));
        assertEquals(true, VeryEvenNumbers.isVeryEvenNumber(24));
        assertEquals(true, VeryEvenNumbers.isVeryEvenNumber(400000220));
    }

}
