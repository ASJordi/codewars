package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCombinerTest {

    @Test
    public void test() {
        assertEquals("James Stevens", StringCombiner.combineNames("James","Stevens"));
    }

}
