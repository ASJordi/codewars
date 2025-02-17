package kyu7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceBetweenTwoCollectionsTest {

    @Test
    public void exampleTests() {
        assertEquals(list(), DifferenceBetweenTwoCollections.diff(list('a', 'b'), list('a', 'b')), "should return empty for the same content");
        assertEquals(list('a', 'b'), DifferenceBetweenTwoCollections.diff(list('a', 'b'), list()), "should return A if B is empty");
        assertEquals(list('a', 'b'), DifferenceBetweenTwoCollections.diff(list(), list('a', 'b')), "should return B if A is empty");
        assertEquals(list(), DifferenceBetweenTwoCollections.diff(list(), list()), "should return empty for the empty content");
        assertEquals(list('z'), DifferenceBetweenTwoCollections.diff(list('a', 'b', 'z'), list('a', 'b')), "should return the last character");
        assertEquals(list('d', 'e', 'j', 'z'), DifferenceBetweenTwoCollections.diff(list('a', 'b', 'z', 'd', 'e', 'd'), list('a', 'b', 'j', 'j')), "should return the sorted characters");
    }

    public List<Character> list(char... elements) {
        ArrayList<Character> list = new ArrayList<>();
        for (char s : elements) {
            list.add(s);
        }
        return list;
    }

}
