package kyu7;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShowMultiplesOf2NumbersWithinARangeTest {

    @Test
    public void testSomeValues14() {
        List<Integer> list1 = ShowMultiplesOf2NumbersWithinARange.findMultiples(2,4,40);
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16, 20, 24, 28, 32, 36));
        System.out.println(list1+"\n"+list2);
        assertTrue(list2.equals(list1));
    }

    @Test
    public void testSomeValues() {
        List<Integer> list1 = ShowMultiplesOf2NumbersWithinARange.findMultiples(5,13,800);
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(65, 130, 195, 260, 325, 390, 455, 520, 585, 650, 715, 780));
        System.out.println(list1+"\n"+list2);
        assertTrue(list2.equals(list1));
    }

    @Test
    public void testSomeValues4() {
        List<Integer> list1 = ShowMultiplesOf2NumbersWithinARange.findMultiples(7,16,1000);
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(112, 224, 336, 448, 560, 672, 784, 896));
        System.out.println(list1+"\n"+list2);
        assertTrue(list2.equals(list1));
    }

}
