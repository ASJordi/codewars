package easy;

import org.junit.*;
import org.junit.rules.*;

public class YouCannotCodeUnderPressureTest {

    @Test
    public final void test_all() {
        Assert.assertEquals( "Nope!" , 4, YouCannotCodeUnderPressure.doubleInteger(2)); // Test cases here!
    }

}
