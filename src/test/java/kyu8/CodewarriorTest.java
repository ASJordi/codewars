package kyu8;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CodewarriorTest {

    private static final List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
    );

    @Test
    public void shouldHoldCorrectValues() {
        var arrayOfLists = Codewarrior.arrayOfLists;
        String msg = "the array must have a length of " + listOfLists.size();
        assertEquals(msg, listOfLists.size(), arrayOfLists.length);

        for (int i = 0; i < listOfLists.size(); i++)
            assertEquals(listOfLists.get(i), arrayOfLists[i]);
    }

}
