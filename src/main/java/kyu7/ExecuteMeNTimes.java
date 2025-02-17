package kyu7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuteMeNTimes {

    public void execute(Runnable action, int nTimes) {
        ExecutorService executor = Executors.newFixedThreadPool(nTimes);

        for (int i = 0; i < nTimes; i++) {
            executor.submit(action);
        }

        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
