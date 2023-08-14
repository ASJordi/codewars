package kyu7;

public class RemoveAllExclamationMarksFromTheEndOfWords {

    public static String removeBang(String str) {
        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].replaceAll("!+$", "");
        }

        return String.join(" ", strArr);
    }

}
