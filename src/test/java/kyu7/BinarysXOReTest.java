package kyu7;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarysXOReTest {

    private static void tester (BigInteger inp, BigInteger exp) {
        assertEquals(exp, BinarysXORe.sxore(inp));
    }

    @Test
    void exampleTests () {
        tester(new BigInteger("0"), new BigInteger("0"));
        tester(new BigInteger("1"), new BigInteger("1"));
        tester(new BigInteger("50"), new BigInteger("51"));
        tester(new BigInteger("1000000"), new BigInteger("1000000"));
    }

}
