package easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SleighAuthenticationTest {

    @Test
    public void test_authentication() {
        assertEquals(true, SleighAuthentication.authenticate("Santa Claus", "Ho Ho Ho!"));
        assertEquals(false, SleighAuthentication.authenticate("Santa", "Ho Ho Ho!"));
        assertEquals(false, SleighAuthentication.authenticate("Santa Claus", "Ho Ho Ho"));
    }

}
