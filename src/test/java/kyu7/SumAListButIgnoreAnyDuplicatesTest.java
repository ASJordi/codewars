package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumAListButIgnoreAnyDuplicatesTest {

    @Test
    public void sampleTests() {
        assertEquals(5, SumAListButIgnoreAnyDuplicates.sumNoDuplicates(new int[]{1, 1, 2, 3}));
        assertEquals(6, SumAListButIgnoreAnyDuplicates.sumNoDuplicates(new int[]{1, 2, 3}));
        assertEquals(3, SumAListButIgnoreAnyDuplicates.sumNoDuplicates(new int[]{1, 1, 2, 2, 3}));
    }

}
