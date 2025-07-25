package kyu7;

import java.util.Arrays;
import java.util.Comparator;

public class SuzukiNeedsHelpLiningUpHisStudents {

    public static String[] lineupStudents(String students) {
        String[] arr = students.split(" ");
        Arrays.sort(arr, Comparator.comparingInt(String::length).thenComparing(String::compareTo).reversed());
        return arr;
    }

}
