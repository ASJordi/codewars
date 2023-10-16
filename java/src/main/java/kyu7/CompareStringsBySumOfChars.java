package kyu7;

public class CompareStringsBySumOfChars {

    public static boolean compare(String s1, String s2) {
        return count(s1) == count(s2);
    }

    public static int count(String s){
        if (s == null || s.isBlank()) return 0;
        s = s.toUpperCase();
        int sum = 0;

        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c)) return 0;
            sum += c;
        }

        return sum;
    }

}
