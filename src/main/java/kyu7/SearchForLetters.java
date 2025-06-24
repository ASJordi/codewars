package kyu7;

public class SearchForLetters {

    public static String search(String line){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        line = line.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < alphabet.length(); i++) {
            sb.append(line.contains(String.valueOf(alphabet.charAt(i))) ? "1" : "0");
        }

        return sb.toString();
    }

}
