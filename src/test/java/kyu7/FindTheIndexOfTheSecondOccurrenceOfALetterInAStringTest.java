package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheIndexOfTheSecondOccurrenceOfALetterInAStringTest {

    @Test
    public void sampleTestCases() {
        assertEquals(3, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("Hello world!!!", 'l'));
        assertEquals(7, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("Hello world!!!", 'o'));
        assertEquals(-1, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("Hello world!!!", 'A'));
        assertEquals(-1, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("", 'q'));
        assertEquals(-1, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("Hello", '!'));
    }

}
