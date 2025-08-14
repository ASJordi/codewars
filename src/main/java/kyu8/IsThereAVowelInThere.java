package kyu8;

import java.util.ArrayList;
import java.util.List;

public class IsThereAVowelInThere {

    public static List<Object> isVow(List<Integer> a) {

        List<Object> list = new ArrayList<>();

        for (Integer code : a) {
            switch (code) {
                case 97 -> list.add("a");
                case 101 -> list.add("e");
                case 105 -> list.add("i");
                case 111 -> list.add("o");
                case 117 -> list.add("u");
                default -> list.add(code);
            }
        }

        return list;
    }

}
