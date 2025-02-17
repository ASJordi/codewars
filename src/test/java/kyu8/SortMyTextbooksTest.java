package kyu8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortMyTextbooksTest {

    @Test
    public void basicTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        Collections.addAll(strs, new String[]{"Algebra", "History", "Geometry", "English"});
        Collections.addAll(sorted, new String[]{"Algebra", "English", "Geometry", "History"});
        assertEquals(sorted, SortMyTextbooks.sort(strs));
    }

    @Test
    public void capitalizationTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        Collections.addAll(strs, new String[]{"Algebra", "history", "Geometry", "english"});
        Collections.addAll(sorted, new String[]{"Algebra", "english", "Geometry", "history"});
        assertEquals(sorted, SortMyTextbooks.sort(strs));
    }

    @Test
    public void symbolsTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        Collections.addAll(strs, new String[]{"Alg#bra", "$istory", "Geom^try", "**English"});
        Collections.addAll(sorted, new String[]{"$istory", "**English", "Alg#bra", "Geom^try"});
        assertEquals(sorted, SortMyTextbooks.sort(strs));
    }

}
