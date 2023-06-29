package easy;

import org.junit.Assert;
import org.junit.Test;

public class MakeUpperCaseTest {

    MakeUpperCase u = new MakeUpperCase();

    @Test
    public void testSomething() {
        Assert.assertEquals("HELLO",u.MakeUpperCase("hello"));
    }

}
