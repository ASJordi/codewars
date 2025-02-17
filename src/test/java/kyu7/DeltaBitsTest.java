package kyu7;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DeltaBitsTest {

    @Test
    public void test() throws Exception {
        assertThat(DeltaBits.convertBits(31, 14), is(2));
    }

}
