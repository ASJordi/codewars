package easy;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FindThePositionTest {

    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", FindThePosition.position('a'));
        assertEquals("Position of alphabet: 26", FindThePosition.position('z'));
        assertEquals("Position of alphabet: 5", FindThePosition.position('e'));
    }

}
