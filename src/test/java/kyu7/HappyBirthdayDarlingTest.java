package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HappyBirthdayDarlingTest {

    @Test
    public void basicTests() {
        assertEquals("32? That's just 20, in base 16!", HappyBirthdayDarling.womensAge(32));
        assertEquals("39? That's just 21, in base 19!", HappyBirthdayDarling.womensAge(39));
        assertEquals("22? That's just 20, in base 11!", HappyBirthdayDarling.womensAge(22));
        assertEquals("65? That's just 21, in base 32!", HappyBirthdayDarling.womensAge(65));
        assertEquals("83? That's just 21, in base 41!", HappyBirthdayDarling.womensAge(83));
    }

}
