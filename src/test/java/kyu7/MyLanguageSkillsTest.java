package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

public class MyLanguageSkillsTest {

    @Test
    public void basicTests() {
        final Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Ruby", 80);
        map1.put("Python", 65);
        assertEquals(Arrays.asList("Ruby", "Python"), MyLanguageSkills.myLanguages(map1));

        final Map<String, Integer> map2 = new HashMap<>();
        map2.put("Hindi", 60);
        map2.put("Dutch", 93);
        map2.put("Greek", 71);
        assertEquals(Arrays.asList("Dutch", "Greek", "Hindi"), MyLanguageSkills.myLanguages(map2));

        final Map<String, Integer> map3 = new HashMap<>();
        map3.put("C++", 50);
        map3.put("ASM", 10);
        map3.put("Haskell", 20);
        assertEquals(Collections.emptyList(), MyLanguageSkills.myLanguages(map3));
    }

}
