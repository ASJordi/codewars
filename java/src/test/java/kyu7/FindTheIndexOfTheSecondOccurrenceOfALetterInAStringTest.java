package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheIndexOfTheSecondOccurrenceOfALetterInAStringTest {

    @Test
    public void sampleTestCases() {
        assertEquals( "Find the index of the second symbol 'l' in the string", 3, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("Hello world!!!", 'l'));
        assertEquals("Find the index of the second symbol 'o' in the string", 7, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("Hello world!!!", 'o'));
        assertEquals("The symbol 'A' is not in the string", -1, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("Hello world!!!", 'A'));
        assertEquals("The symbol 'q' is not in the string", -1, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("", 'q'));
        assertEquals("The symbol '!' is not in the string", -1, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("Hello", '!'));
    }

}
