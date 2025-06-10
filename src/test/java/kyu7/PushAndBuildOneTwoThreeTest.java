package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PushAndBuildOneTwoThreeTest {

    @Test
    public void testPush() {
        // tests for inserting a node before another node.
        assertEquals(1,
                PushAndBuildOneTwoThree.push(null, 1).data,
                "Should be able to create a new linked list with push()."
        );

        assertEquals(null,
                PushAndBuildOneTwoThree.push(null, 1).next,
                "Should be able to create a new linked list with push()."
        );

        assertEquals(2,
                PushAndBuildOneTwoThree.push(new PushAndBuildOneTwoThree(1), 2).data,
                "Should be able to prepend a node to an existing node."
        );

        assertEquals(1,
                PushAndBuildOneTwoThree.push(new PushAndBuildOneTwoThree(1), 2).next.data,
                "Should be able to prepend a node to an existing node."
        );
    }

    @Test
    public void testBuild123() {
        // tests for building a linked list.
        assertEquals(1, PushAndBuildOneTwoThree.buildOneTwoThree().data, "Value at index 0 should be 1.");
        assertEquals(2, PushAndBuildOneTwoThree.buildOneTwoThree().next.data, "Value at index 1 should be 2.");
        assertEquals(3, PushAndBuildOneTwoThree.buildOneTwoThree().next.next.data, "Value at index 2 should be 3.");
        assertEquals(null, PushAndBuildOneTwoThree.buildOneTwoThree().next.next.next, "Value at index 3 should be null.");
    }

}
