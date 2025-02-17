package kyu8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnfinishedLoopTest {

    UnfinishedLoop k = new UnfinishedLoop();

    @Test
    public void SampleTests() {
        assertEquals(List.of(1), UnfinishedLoop.CreateList(1));
        assertEquals(Arrays.asList(1, 2), UnfinishedLoop.CreateList(2));
        assertEquals(Arrays.asList(1, 2, 3), UnfinishedLoop.CreateList(3));
        assertEquals(Arrays.asList(1, 2, 3, 4), UnfinishedLoop.CreateList(4));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), UnfinishedLoop.CreateList(5));
    }

}
