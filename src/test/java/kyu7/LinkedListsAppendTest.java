package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LinkedListsAppendTest {

    @Test
    public void twoEmpty() throws Exception {
        assertNull(LinkedListsAppend.append(null,null) );
    }

    @Test
    public void oneEmpty() throws Exception {
        NodeHelper.assertEquals(LinkedListsAppend.append(null, new LinkedListsAppend( 1 ) ), new LinkedListsAppend( 1 ) );
        NodeHelper.assertEquals(LinkedListsAppend.append(new LinkedListsAppend( 1 ), null ), new LinkedListsAppend( 1 ) );
    }

    @Test
    public void oneOne() throws Exception {
        NodeHelper.assertEquals( LinkedListsAppend.append( new LinkedListsAppend( 1 ), new LinkedListsAppend( 2 ) ), NodeHelper.build( new int[] { 1, 2 } ) );
        NodeHelper.assertEquals( LinkedListsAppend.append( new LinkedListsAppend( 2 ), new LinkedListsAppend( 1 ) ), NodeHelper.build( new int[] { 2, 1 } ) );
    }

    @Test
    public void bigLists() throws Exception {
        NodeHelper.assertEquals(
                LinkedListsAppend.append( NodeHelper.build( new int[] { 1, 2 } ), NodeHelper.build( new int[] { 3, 4 } ) ),
                NodeHelper.build( new int[] { 1, 2, 3, 4 } )
        );
        NodeHelper.assertEquals(
                LinkedListsAppend.append( NodeHelper.build( new int[] { 1, 2, 3, 4, 5 } ), NodeHelper.build( new int[] { 6, 7, 8 } ) ),
                NodeHelper.build( new int[] { 1, 2, 3, 4, 5, 6, 7, 8 } )
        );
    }

    private static class NodeHelper {
        public static void assertEquals(LinkedListsAppend expected, LinkedListsAppend actual) {
            if (expected == null) {
                assertNull(actual);
                return;
            }
            while (expected != null) {
                if (actual == null) {
                    throw new AssertionError("Expected: " + expected + " but was: " + actual);
                }
                if (expected.data != actual.data) {
                    throw new AssertionError("Expected: " + expected + " but was: " + actual);
                }
                expected = expected.next;
                actual = actual.next;
            }
            assertNull(actual);
        }

        public static LinkedListsAppend build(int[] ints) {
            LinkedListsAppend head = null;
            LinkedListsAppend current = null;
            for (int i = 0; i < ints.length; i++) {
                if (head == null) {
                    head = new LinkedListsAppend(ints[i]);
                    current = head;
                } else {
                    current.next = new LinkedListsAppend(ints[i]);
                    current = current.next;
                }
            }
            return head;
        }
    }
}
