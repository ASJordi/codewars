package easy;

import java.util.Objects;

public class RemoveNExclamationMarksInTheSentenceFromLeftToRight {

    public static String remove(String s, int n){

        for(int i = 0; i < n; i++) s = s.replaceFirst("!","");

        return s;

    }

}
