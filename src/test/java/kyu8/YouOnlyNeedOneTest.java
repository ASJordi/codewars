package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YouOnlyNeedOneTest {

    @Test
    public void testSomething() {
        assertTrue(YouOnlyNeedOne.check(new Object[]{66, 101}, 66));
        assertTrue(YouOnlyNeedOne.check(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45));
        assertTrue(YouOnlyNeedOne.check(new Object[]{'t', 'e', 's', 't'}, 'e'));
        assertFalse(YouOnlyNeedOne.check(new Object[]{"what", "a", "great", "kata"}, "kat"));
    }

}
