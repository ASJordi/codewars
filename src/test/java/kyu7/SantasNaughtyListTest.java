package kyu7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SantasNaughtyListTest {

    @Test
    public void basicTest() {
        ArrayList<String> santasList = new ArrayList<>();
        ArrayList<String> children = new ArrayList<>();
        Collections.addAll(santasList, new String[]{"Jason", "Jackson", "Jordan", "Johnny"});
        Collections.addAll(children, new String[]{"Jason", "Jordan", "Jennifer"});
        ArrayList<String> goodChildren = new ArrayList<>();

        Collections.addAll(goodChildren, new String[]{"Jason", "Jordan"});
        assertEquals(goodChildren, SantasNaughtyList.findChildren(santasList, children));
    }

    @Test
    public void sortingTest() {
        ArrayList<String> santasList = new ArrayList<>();
        ArrayList<String> children = new ArrayList<>();
        Collections.addAll(santasList, new String[]{"Jason", "Jackson", "Johnson", "JJ"});
        Collections.addAll(children, new String[]{"Jason", "James", "JJ"});
        ArrayList<String> goodChildren = new ArrayList<>();

        Collections.addAll(goodChildren, new String[]{"JJ", "Jason"});
        assertEquals(goodChildren, SantasNaughtyList.findChildren(santasList, children));
    }

    @Test
    public void capitalizationTest() {
        ArrayList<String> santasList = new ArrayList<>();
        ArrayList<String> children = new ArrayList<>();
        Collections.addAll(santasList, new String[]{"jASon", "JAsoN", "JaSON", "jasON"});
        Collections.addAll(children, new String[]{"JasoN", "jASOn", "JAsoN", "jASon", "JASON"});
        ArrayList<String> goodChildren = new ArrayList<>();

        Collections.addAll(goodChildren, new String[]{"JAsoN", "jASon"});
        assertEquals(goodChildren, SantasNaughtyList.findChildren(santasList, children));
    }

}
