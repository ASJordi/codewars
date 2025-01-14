package kyu7;

public class AlphabetSymmetry {

    private final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static int[] solve(String[] arr){
        int[] positions = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i].toLowerCase();
            for (int j = 0; j < word.length(); j++) {
                char current = word.charAt(j);
                if ((j < ALPHABET.length()) && (current == ALPHABET.charAt(j))) {
                    positions[i]++;
                }
            }
        }

        return positions;
    }

}
