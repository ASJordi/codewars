package kyu7;

import java.util.*;

public class FindTheCapitals {

    public static int[] capitals(String s){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) list.add(i);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

}
