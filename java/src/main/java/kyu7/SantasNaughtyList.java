package kyu7;

import java.util.List;

public class SantasNaughtyList {

    public static List<String> findChildren(List<String> santasList, List<String> children) {
        return santasList.stream().filter(children::contains).distinct().sorted().toList();
    }

}
