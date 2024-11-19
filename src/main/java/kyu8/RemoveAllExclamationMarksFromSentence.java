package kyu8;

public class RemoveAllExclamationMarksFromSentence {
    
    static String remove(String s) {
        s = s.replace("!", "");
        return s + "!";
    }

}
