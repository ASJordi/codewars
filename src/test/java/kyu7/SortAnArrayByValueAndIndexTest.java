package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class SortAnArrayByValueAndIndexTest {
    
    @Test
    public void exampleTests() {
      
      int[] actual = SortAnArrayByValueAndIndex.sortByValueAndIndex(new int[] { 1, 2, 3, 4, 5 });
      int[] expected = new int[] { 1, 2, 3, 4, 5 };
      String message = "Your result:\n" + arrayToString(actual) + "\n\nExpected result:\n" + arrayToString(expected) + "\n\n";
      assertEquals(arrayToString(expected), arrayToString(actual), message);
      
      actual = SortAnArrayByValueAndIndex.sortByValueAndIndex(new int[] { 23, 2, 3, 4, 5 });
      expected = new int[] { 2, 3, 4, 23, 5 };
      message = "Your result:\n" + arrayToString(actual) + "\n\nExpected result:\n" + arrayToString(expected) + "\n\n";
      assertEquals(arrayToString(expected), arrayToString(actual), message);
      
      actual = SortAnArrayByValueAndIndex.sortByValueAndIndex(new int[] { 26, 2, 3, 4, 5 });
      expected = new int[] { 2, 3, 4, 5, 26 };
      message = "Your result:\n" + arrayToString(actual) + "\n\nExpected result:\n" + arrayToString(expected) + "\n\n";
      assertEquals(arrayToString(expected), arrayToString(actual), message);
      
      actual = SortAnArrayByValueAndIndex.sortByValueAndIndex(new int[] { 9, 5, 1, 4, 3 });
      expected = new int[] { 1, 9, 5, 3, 4 };
      message = "Your result:\n" + arrayToString(actual) + "\n\nExpected result:\n" + arrayToString(expected) + "\n\n";
      assertEquals(arrayToString(expected), arrayToString(actual), message);
    }
    
    private String arrayToString(int[] array) {
      return Arrays.toString(array);
    }

}
