package kyu7;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfPowersOfItsDigitsTest {

    @Test
    void test() {
        System.out.println("Fixed Tests");
        assertEquals("[]", Arrays.toString(SumOfPowersOfItsDigits.eqSumPowDig(100, 2)));
        assertEquals("[153]", Arrays.toString(SumOfPowersOfItsDigits.eqSumPowDig(200, 3)));
        assertEquals("[153, 370]", Arrays.toString(SumOfPowersOfItsDigits.eqSumPowDig(370, 3)));
        assertEquals("[153, 370, 371]", Arrays.toString(SumOfPowersOfItsDigits.eqSumPowDig(400, 3)));
        assertEquals("[153, 370, 371, 407]", Arrays.toString(SumOfPowersOfItsDigits.eqSumPowDig(500, 3)));
    }

}
