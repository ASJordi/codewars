package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RunRunnerTest {

    @Test
    public void test() {
        RunRunner.runRunners();
        assertTrue(RunRunner.ThreadUtil.checkThreads(), "Sorry, try again :-(");
    }

}
