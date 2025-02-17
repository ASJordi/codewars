package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaulsMiseryTest {

    @Test
    public void basicTest(){
        String[] a1 = new String[]{"life", "eating", "life"};
        String a1s = Arrays.stream(a1).collect(Collectors.joining(", "));
        String[] a2 = new String[]{"life", "Petes kata", "Petes kata", "Petes kata", "eating"};
        String a2s = Arrays.stream(a2).collect(Collectors.joining(", "));
        String[] a3 = new String[]{"Petes kata", "Petes kata", "eating", "Petes kata", "Petes kata", "eating"};
        String a3s = Arrays.stream(a3).collect(Collectors.joining(", "));
        String[] a4 = new String[]{"Petes kata", "Petes kata","Petes kata","Petes kata","Petes kata","Petes kata","Petes kata","Petes kata","Petes kata","kata", "eating", "eating", "eating", "eating"};
        String a4s = Arrays.stream(a4).collect(Collectors.joining(", "));

        assertEquals("For input \"" + a1s + "\"", "Super happy!", PaulsMisery.paul(a1));
        assertEquals("For input \"" + a2s + "\"", "Super happy!", PaulsMisery.paul(a2));
        assertEquals("For input \"" + a3s + "\"", "Happy!", PaulsMisery.paul(a3));
        assertEquals("For input \"" + a4s + "\"", "Sad!", PaulsMisery.paul(a4));

    }

}
