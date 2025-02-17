package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaFunctionalProgrammingClosuredforBusinessTest {

    @Test
    public void testMakeFunction() throws Exception {
        assertEquals(5, JavaFunctionalProgrammingClosuredforBusiness.create(1).applyAsInt(4), "Created add 1 function; gave it 4; did not get 5 back");
    }

}
