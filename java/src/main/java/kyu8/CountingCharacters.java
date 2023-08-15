package kyu8;

public class CountingCharacters {

    public static int countCharOccurrences(String s, char c) {
        int count = 0;

        for (char ch : s.toCharArray()) if (ch == c) count++;

        return count;
    }

}
