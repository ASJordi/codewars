package kyu7;

import java.util.*;
import java.util.stream.Collectors;

public class DifferenceBetweenTwoCollections {

    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
        Set<Character> setA = new HashSet<>(a);
        Set<Character> setB = new HashSet<>(b);

        setA.removeAll(setB);
        setB.removeAll(new HashSet<>(a));

        setA.addAll(setB);
        return setA.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

}
