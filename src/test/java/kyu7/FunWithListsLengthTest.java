package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunWithListsLengthTest {

//    @Test
//    public void basicTests() {
//        assertEquals(0, FunWithListsLength.length(null));
//        assertEquals(3, FunWithListsLength.length(Helpers.listFromArray(1, 2, 3)));
//        assertEquals(3, FunWithListsLength.length(Helpers.listFromArray("aaa", "b", "abc")));
//        assertEquals(4, FunWithListsLength.length(Helpers.listFromArray(1, 2, 3, 4)));
//    }
//
//    @Test
//    public void randomTests() {
//        for (int i = 0; i < 100; i++) {
//            FunWithListsLength.Node head = Helpers.listFromArray(Helpers.randomArray(Helpers.randomInt(20, 100)));
//            int expected = lengthSol(head);
//            assertEquals(expected, FunWithListsLength.length(head));
//        }
//    }

    private static int lengthSol(FunWithListsLength.Node head) {
        return head == null ? 0 : 1 + lengthSol(head.next);
    }

}
