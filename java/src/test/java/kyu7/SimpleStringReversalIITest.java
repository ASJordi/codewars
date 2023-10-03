package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleStringReversalIITest {

    @Test
    public void basicTests(){
        assertEquals("cawedors", SimpleStringReversalII.solve("codewars",1,5));
        assertEquals("conuFsIgnid", SimpleStringReversalII.solve("codingIsFun",2,100));
        assertEquals("FuargorPlanoitcnmming", SimpleStringReversalII.solve("FunctionalProgramming", 2,15));
        assertEquals("vutsrqponmlkjihgfecbawxyz", SimpleStringReversalII.solve("abcefghijklmnopqrstuvwxyz",0,20));
        assertEquals("abcefvutsrqponmlkjihgwxyz", SimpleStringReversalII.solve("abcefghijklmnopqrstuvwxyz",5,20));
    }

}
