package kyu7;

import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

    public static String removeDuplicateWords(String s){
        LinkedHashSet<String> onlyWords = new LinkedHashSet<>();
        String[] words = s.split(" ");
        Collections.addAll(onlyWords, words);
        return String.join(" ", onlyWords);
//        return Arrays.stream( s.split("\\s+")).distinct().collect(Collectors.joining(" ") );
    }

}
