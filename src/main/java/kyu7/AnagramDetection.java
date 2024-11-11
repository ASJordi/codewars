package kyu7;

import java.util.Arrays;

public class AnagramDetection {

    public static boolean isAnagram(String test, String original) {
        test = test.toLowerCase();
        original = original.toLowerCase();

        String[] testArr = test.split("");
        String[] originalArr = original.split("");

        Arrays.sort(testArr);
        Arrays.sort(originalArr);

        return String.join("", testArr).equals(String.join("", originalArr));
    }

}
