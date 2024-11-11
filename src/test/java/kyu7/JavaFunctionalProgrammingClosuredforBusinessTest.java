package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JavaFunctionalProgrammingClosuredforBusinessTest {

    @Test
    public void testMakeFunction() throws Exception {
        assertEquals("Created add 1 function; gave it 4; did not get 5 back",
                5, JavaFunctionalProgrammingClosuredforBusiness.create(1).applyAsInt(4));
    }

}
