package kyu8;

public class RemoveFirstAndLastCharacter {

    public static void main(String[] args) {
        String str = "eloquent";
        StringBuilder word = new StringBuilder();
        String[] strArray = str.split("");

        for (int i = 0; i < strArray.length; i++) {
            if ((i == 0) || (i == strArray.length - 1)) continue;
            word.append(strArray[i]);
        }

        System.out.println(word);
    }

    public static String remove(String str) {

        StringBuilder word = new StringBuilder();
        char[] strArray = str.toCharArray();

        for (int i = 1; i < strArray.length - 1; i++) {
            word.append(strArray[i]);
        }

        return word.toString();
//         return str.substring(1, str.length() - 1);
    }

}
