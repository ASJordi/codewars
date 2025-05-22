package kyu7;

import java.util.*;

public class MyLanguageSkills {

    record Language(String name, Integer score) {}

    public static List<String> myLanguages(final Map<String, Integer> results) {
        List<Language> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            list.add(new Language(entry.getKey(), entry.getValue()));
        }

        return list.stream()
                .sorted(Comparator.comparing(Language::score).reversed())
                .filter(lang -> lang.score >= 60)
                .collect(ArrayList::new, (l, e) -> l.add(e.name), ArrayList::addAll);
    }

}
