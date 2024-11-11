package kyu7;

public class ChangingLetters {

    public static String swap(String st){
        StringBuilder word = new StringBuilder();

        for (char c : st.toCharArray()){
            if ("aeiou".contains(String.valueOf(c))) word.append(String.valueOf(c).toUpperCase());
            else word.append(c);
        }

        return word.toString();
    }

}
