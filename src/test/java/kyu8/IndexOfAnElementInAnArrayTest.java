package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexOfAnElementInAnArrayTest {

    @Test
    public void testFind() {
        String[] array = {"2", "3", "5", "7", "11"};
        assertEquals(IndexOfAnElementInAnArray.kata(array, "5"), "2");
        assertEquals(IndexOfAnElementInAnArray.kata(array, "11"), "4");
    }

    @Test
    public void testNoutFound() {
        String[] array = {"2", "3", "5", "7", "11"};
        assertEquals(IndexOfAnElementInAnArray.kata(array, "843646"), "Not found");
    }

}
