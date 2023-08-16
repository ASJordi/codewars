package kyu7;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class SumAListButIgnoreAnyDuplicatesTest {

    @Test
    public void sampleTests() {
        assertEquals("Incorrect answer for arr = "+ Arrays.toString(new int[]{1, 1, 2, 3}), 5 , SumAListButIgnoreAnyDuplicates.sumNoDuplicates(new int[]{1, 1, 2, 3}));
        assertEquals("Incorrect answer for arr = "+ Arrays.toString(new int[]{1,2,3}), 6 , SumAListButIgnoreAnyDuplicates.sumNoDuplicates(new int[]{1, 2, 3}));
        assertEquals("Incorrect answer for arr = "+ Arrays.toString(new int[]{1, 1, 2, 2, 3}), 3 , SumAListButIgnoreAnyDuplicates.sumNoDuplicates(new int[]{1, 1, 2, 2, 3}));
    }

}
