package easy;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BasicMathematicalOperationsTest {

    @Test
    public void testBasics()
    {
        assertThat(BasicMathematicalOperations.basicMath("+", 4, 7), is(11));
        assertThat(BasicMathematicalOperations.basicMath("-", 15, 18), is(-3));
        assertThat(BasicMathematicalOperations.basicMath("*", 5, 5), is(25));
        assertThat(BasicMathematicalOperations.basicMath("/", 49, 7), is(7));
    }

}
