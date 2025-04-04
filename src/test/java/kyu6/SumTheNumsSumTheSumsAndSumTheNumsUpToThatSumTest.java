package kyu6;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTheNumsSumTheSumsAndSumTheNumsUpToThatSumTest {

    @Test
    public void exampleTests() {
        // assertEquals("expected", "actual");
        assertEquals(new BigInteger("55"), SumTheNumsSumTheSumsAndSumTheNumsUpToThatSum.sumOfSums(3));
        assertEquals(new BigInteger("630"), SumTheNumsSumTheSumsAndSumTheNumsUpToThatSum.sumOfSums(5));
        assertEquals(new BigInteger("14740530850"), SumTheNumsSumTheSumsAndSumTheNumsUpToThatSum.sumOfSums(100));
    }

}
