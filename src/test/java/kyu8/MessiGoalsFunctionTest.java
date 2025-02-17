package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessiGoalsFunctionTest {

    @Test
    public void basicTests() {
        assertEquals(0, MessiGoalsFunction.goals(0, 0, 0));
        assertEquals(58, MessiGoalsFunction.goals(43, 10, 5));
    }

}
