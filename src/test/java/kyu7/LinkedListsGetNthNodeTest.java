package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListsGetNthNodeTest {

    private void doTest(LinkedListsGetNthNode linkedListsGetNthNode, int index, int expected) {
        try {
            int actual = LinkedListsGetNthNode.getNth(linkedListsGetNthNode, index);
            assertEquals(expected, actual, "for index = " + index);
        } catch (Exception e) {
            fail("for index = " + index + " expected " + expected + " but an Exception was thrown");
        }
    }

    private void doTest(LinkedListsGetNthNode LinkedListsGetNthNode, int index) {
        assertThrows(Exception.class, () -> LinkedListsGetNthNode.getNth(LinkedListsGetNthNode, index), "for index = " + index);
    }

    @Test
    public void test0() {
        LinkedListsGetNthNode n = new LinkedListsGetNthNode();
        n.data = 1337;
        doTest(n, 0, 1337);
    }

    @Test
    public void test2() {
        LinkedListsGetNthNode n = new LinkedListsGetNthNode();
        n.data = 1337;
        n.next = new LinkedListsGetNthNode();
        n.next.data = 42;
        n.next.next = new LinkedListsGetNthNode();
        n.next.next.data = 23;
        doTest(n, 0, 1337);
        doTest(n, 1, 42);
        doTest(n, 2, 23);
        doTest(n, -1);
        doTest(n, 3);
        doTest(n, 1000);
    }

    @Test
    public void testNull() {
        doTest(null, 0);
    }

    @Test
    public void testWrongIdx() {
        doTest(new LinkedListsGetNthNode(), 1);
    }

}
