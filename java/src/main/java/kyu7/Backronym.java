package kyu7;

import java.util.HashMap;
import java.util.Map;

public class Backronym {

    private static Map<String, String> dictionary = getDictionary();

    public static String makeBackronym(String acronym) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < acronym.length(); i++) {
            String c = Character.toString(acronym.charAt(i)).toUpperCase();
            if (dictionary.containsKey(c)){
                res.append(dictionary.get(c)).append(" ");
            }
        }

        return res.toString().trim();
//        return acronym.toUpperCase().chars().mapToObj(i -> dictionary.get("" + (char)i)).collect(Collectors.joining(" "));
    }

    private static Map<String, String> getDictionary(){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("A", "awesome");
        dictionary.put("D", "disturbing");
        dictionary.put("G", "gregarious");
        dictionary.put("M", "mustache");
        dictionary.put("L", "literal");
        dictionary.put("K", "klingon");
        dictionary.put("J", "joke");
        return dictionary;
    }

}
