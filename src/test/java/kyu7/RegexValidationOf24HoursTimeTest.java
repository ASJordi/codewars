package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegexValidationOf24HoursTimeTest {

    @Test
    void test1() {
        assertTrue(RegexValidationOf24HoursTime.validateTime("01:00"));
    }

    @Test
    void test2() {
        assertTrue(RegexValidationOf24HoursTime.validateTime("1:00"));
    }

    @Test
    void test3() {
        assertTrue(RegexValidationOf24HoursTime.validateTime("00:00"));
    }

    @Test
    void test4() {
        assertFalse(RegexValidationOf24HoursTime.validateTime("13:1"));
    }

    @Test
    void test5() {
        assertFalse(RegexValidationOf24HoursTime.validateTime("12:60"));
    }

}
