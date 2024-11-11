package kyu8;

public class AllStarCodeChallenge {

    public static int strCount(String str, char letter) {

        if (str.isEmpty()) return 0;

        char[] characters = str.toCharArray();
        int count = 0;

        for (char c : characters) {
            if (c == letter) count += 1;
        }

        return count;
    }

}
