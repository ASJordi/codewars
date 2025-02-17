package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CovfefeTest {

    @Test
    public void basicTest() {
//        assertEquals("covfefe", Covfefe.covfefe("coverage"));
//        assertEquals("covfefe covfefe", Covfefe.covfefe("coverage coverage"));
//        assertEquals("nothing covfefe", Covfefe.covfefe("nothing"));
        assertEquals( "double space  covfefe" ,Covfefe.covfefe("double space "));
//        assertEquals("covfefe covfefe", Covfefe.covfefe("covfefe"));
//        assertEquals("erag covfefe", Covfefe.covfefe("erag"));
    }

}
