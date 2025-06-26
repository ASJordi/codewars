package kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SillyAdditionTest {
    
    @Test
    public void RealAddition() {
        System.out.println("****** Real addition ******");
        assertEquals(13, SillyAddition.add(2,11));
        assertEquals(1, SillyAddition.add(0,1));
        assertEquals(0, SillyAddition.add(0,0));
    }


    @Test
    public void SillyAdditon() {
        System.out.println("****** Silly addition******");
        assertEquals(214, SillyAddition.add(16,18));
        assertEquals(515, SillyAddition.add(26,39));
        assertEquals(1103, SillyAddition.add(122,81));
    }

}
