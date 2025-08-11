package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidTeamsAndNamesTest {

    @Test
    public void sample_test_1() {
        String actual = ValidTeamsAndNames.validate("A:Stefan,Milica,Zvonimir,AndrewH:Richard");
        String expected = "1:Stefan,Milica,Zvonimir,Andrew";
        assertEquals(expected, actual);
    }

    @Test
    public void sample_test_2() {
        String actual = ValidTeamsAndNames.validate("W:John,John,John,JohnC:Danger,Man");
        String expected = "2:John,John,John,John,Danger,Man";
        assertEquals(expected, actual);
    }

}
