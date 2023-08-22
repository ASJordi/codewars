package kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class OnesAndZerosTest {

    @org.junit.Test
    public void convertBinaryArrayToInt() throws Exception {

        assertEquals(1, OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
        assertEquals(15, OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
        assertEquals(6, OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
        assertEquals(9, OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
    }

}
