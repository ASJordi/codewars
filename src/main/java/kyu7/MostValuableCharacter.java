package kyu7;

import static java.util.Comparator.comparing;

public class MostValuableCharacter {

    public static char solve(String s){
        return (char) s.chars().sorted().boxed()
                .min(comparing(c -> s.indexOf(c) - s.lastIndexOf(c))).orElse(0).intValue();
    }

}
