package kyu7;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExecuteMeNTimesTest {

    @Test
    public void SampleTests() {

        ExecuteMeNTimes w = new ExecuteMeNTimes();
        int counter = 20;
        AtomicInteger executionCounter = new AtomicInteger();

        Runnable action = () -> {
            System.out.print(".");
            executionCounter.incrementAndGet();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        };

        w.execute(action, counter);

        int actualCounter = executionCounter.get();
        if (counter != actualCounter) System.out.println("Action was executed " + actualCounter + " times instead of " + counter + " times");
        assertEquals(counter, actualCounter);
    }

}
