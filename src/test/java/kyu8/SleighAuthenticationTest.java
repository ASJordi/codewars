package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SleighAuthenticationTest {

    @Test
    public void test_authentication() {
        assertEquals(true, SleighAuthentication.authenticate("Santa Claus", "Ho Ho Ho!"));
        assertEquals(false, SleighAuthentication.authenticate("Santa", "Ho Ho Ho!"));
        assertEquals(false, SleighAuthentication.authenticate("Santa Claus", "Ho Ho Ho"));
    }

}
