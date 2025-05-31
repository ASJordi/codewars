package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersWithDOccurrencesOfDigitDTest {

    @Test
    public void sampleTests() {
        assertEquals(NumbersWithDOccurrencesOfDigitD.isDD(30313), true);
        assertEquals(NumbersWithDOccurrencesOfDigitD.isDD(122), true);
        assertEquals(NumbersWithDOccurrencesOfDigitD.isDD(664444309), true);
        assertEquals(NumbersWithDOccurrencesOfDigitD.isDD(5023011), false);
        assertEquals(NumbersWithDOccurrencesOfDigitD.isDD(9081231), false);
    }

}
