package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetsSplitThisJointTest {

    private static String[] show(final String[] ary) {
        System.out.println(Arrays.toString(ary));
        return ary;
    }

    @Test
    public void example() {
        assertArrayEquals(new String[]{"a","b","c"}, show(LetsSplitThisJoint.split("a.b.c")));
    }

}
