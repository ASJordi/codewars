package easy;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {

    @Test
    public void testSomething() {
        Assert.assertEquals(20.0, Multiply.multiply(10.0, 2.0), 0.0001);
    }
}
