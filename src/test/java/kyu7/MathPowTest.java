package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigInteger;

public class MathPowTest {

    private static final BigInteger two=new BigInteger("2");
    private static final BigInteger no=new BigInteger("-1");

    @Test
    public void FixedTest1() {
        assertEquals(no, MathPow.pow(no, no));

    }

    @Test
    public void FixedTest2() {
        assertEquals(no, MathPow.pow(two, no));
    }

    @Test
    public void FixedTest3() {
        assertEquals(new BigInteger("4"), MathPow.pow(two, two));
    }

    @Test
    public void FixedTest4() {
        final BigInteger three=new BigInteger("3");
        assertEquals(new BigInteger("81"), MathPow.pow(three, three));
    }

}
