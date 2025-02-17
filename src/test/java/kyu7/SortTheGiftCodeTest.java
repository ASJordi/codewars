package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTheGiftCodeTest {

    @Test
    public void Tests1() throws Exception {
        SortTheGiftCode gs = new SortTheGiftCode();
        assertEquals("sort fedcba", "abcdef", gs.sortGiftCode("fedcba"));
    }

    @Test
    public void Tests2() throws Exception {
        SortTheGiftCode gs = new SortTheGiftCode();
        assertEquals("reverse alphabet", "abcdefghijklmnopqrstuvwxyz", gs.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }

}
