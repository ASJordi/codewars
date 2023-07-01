package easy;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountTheMonkeysTest {

    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1,2,3,4,5},CountTheMonkeys.monkeyCount(5));
//        assertArrayEquals(new int[]{1,2,3},CountTheMonkeys.monkeyCount(3));
//        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9},CountTheMonkeys.monkeyCount(9));
//        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10},CountTheMonkeys.monkeyCount(10));
//        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},CountTheMonkeys.monkeyCount(20));
    }

}
