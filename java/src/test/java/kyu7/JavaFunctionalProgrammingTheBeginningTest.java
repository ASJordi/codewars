package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JavaFunctionalProgrammingTheBeginningTest {

    @Test
    public void testJohnSmith() throws Exception {
        Student jSmith = new Student("John", "Smith", "js123");
        assertTrue(JavaFunctionalProgrammingTheBeginning.f.apply(jSmith));
    }


}
