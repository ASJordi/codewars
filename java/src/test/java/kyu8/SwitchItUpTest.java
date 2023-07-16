package kyu8;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SwitchItUpTest {

    @Test
    public void basicTests() {
        assertEquals("One", SwitchItUp.switchItUp(1));
        assertEquals("Three", SwitchItUp.switchItUp(3));
        assertEquals("Five", SwitchItUp.switchItUp(5));
    }

}
