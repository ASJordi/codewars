package easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MessiGoalsFunctionTest {

    @Test
    public void basicTests() {
        assertEquals(0, MessiGoalsFunction.goals(0, 0, 0));
        assertEquals(58, MessiGoalsFunction.goals(43, 10, 5));
    }

}
