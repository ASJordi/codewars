package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTheGiftCodeTest {

    @Test
    public void Tests1() throws Exception {
        SortTheGiftCode gs = new SortTheGiftCode();
        assertEquals("abcdef", gs.sortGiftCode("fedcba"));
    }

    @Test
    public void Tests2() throws Exception {
        SortTheGiftCode gs = new SortTheGiftCode();
        assertEquals("abcdefghijklmnopqrstuvwxyz", gs.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }

}
