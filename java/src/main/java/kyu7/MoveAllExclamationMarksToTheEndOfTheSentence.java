package kyu7;

public class MoveAllExclamationMarksToTheEndOfTheSentence {

    public static String remove(String s){
        String[] str = s.split(" ");
        int count = 0;

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == '!') count++;
            }
            str[i] = str[i].replace("!", "");
        }

        return String.join(" ", str) + "!".repeat(count);

//        String newStr = s.replace("!", "");
//        return newStr + "!".repeat(s.length() - newStr.length());
    }

}
