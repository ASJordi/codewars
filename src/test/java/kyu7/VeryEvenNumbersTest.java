package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VeryEvenNumbersTest {

    @Test
    public void sampleTests() {
        assertTrue(VeryEvenNumbers.isVeryEvenNumber(0));
        assertTrue(VeryEvenNumbers.isVeryEvenNumber(4));
        assertFalse(VeryEvenNumbers.isVeryEvenNumber(12));
        assertTrue(VeryEvenNumbers.isVeryEvenNumber(222));
        assertFalse(VeryEvenNumbers.isVeryEvenNumber(5));
        assertFalse(VeryEvenNumbers.isVeryEvenNumber(45));
        assertFalse(VeryEvenNumbers.isVeryEvenNumber(4554));
        assertFalse(VeryEvenNumbers.isVeryEvenNumber(1234));
        assertFalse(VeryEvenNumbers.isVeryEvenNumber(88));
        assertTrue(VeryEvenNumbers.isVeryEvenNumber(24));
        assertTrue(VeryEvenNumbers.isVeryEvenNumber(400000220));
    }

}
