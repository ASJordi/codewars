package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MultiplicationTableTest {

    @Test
    public void test3() {
        int[][] test = {{1,2,3},{2,4,6},{3,6,9}};
        assertArrayEquals(test, MultiplicationTable.multiplicationTable(3));
    }
    @Test
    public void test1(){
        int[][] test1 = {{1}};
        assertArrayEquals(test1, MultiplicationTable.multiplicationTable(1));
    }

}
