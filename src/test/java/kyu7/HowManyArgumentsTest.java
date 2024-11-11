package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.math.BigInteger;

public class HowManyArgumentsTest {

    @Test
    public void sampleTest() {
        assertEquals(3, HowManyArguments.countArgs(1, 2, 3));
        assertEquals(3, HowManyArguments.countArgs(1, 2, "uhsaf uas"));
        assertEquals(1, HowManyArguments.countArgs(1));
        assertEquals(4, HowManyArguments.countArgs('a', 865, "asfhgajsf", new BigInteger("123456")));
        assertEquals(0, HowManyArguments.countArgs());
    }

}
