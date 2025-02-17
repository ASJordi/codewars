package kyu7;

public class WordValues {

    public static int[] nameValue(String[] arr) {
        int[] values = new int[arr.length];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i].replace(" ", "");
            int sum = 0;
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                int pos = alphabet.indexOf(c) + 1;
                sum += pos;
                values[i] = sum * (i + 1);
            }
        }
        return values;
    }

}
