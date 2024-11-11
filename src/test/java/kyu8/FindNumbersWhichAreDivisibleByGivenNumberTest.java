package kyu8;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class FindNumbersWhichAreDivisibleByGivenNumberTest {

    @Test public void testSimple() {
        assertArrayEquals(new int[] {2,4,6}, FindNumbersWhichAreDivisibleByGivenNumber.divisibleBy(new int[] {1,2,3,4,5,6},2));
        assertArrayEquals(new int[] {3,6}, FindNumbersWhichAreDivisibleByGivenNumber.divisibleBy(new int[] {1,2,3,4,5,6},3));
        assertArrayEquals(new int[] {0,4}, FindNumbersWhichAreDivisibleByGivenNumber.divisibleBy(new int[] {0,1,2,3,4,5,6},4));
    }

}
