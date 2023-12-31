package kyu8;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;

public class IsItEvenTest {

    private IsItEven num;

    @Before
    public void setUp() throws Exception {
        num = new IsItEven();
    }

    @After
    public void setDown() throws Exception {
        num = null;
    }

    @Test
    public void test() {
        assertEquals(true, num.isEven(0));
        assertEquals(false, num.isEven(0.5));
        assertEquals(false, num.isEven(1));
        assertEquals(true, num.isEven(2));
        assertEquals(true, num.isEven(-4));
    }

}
