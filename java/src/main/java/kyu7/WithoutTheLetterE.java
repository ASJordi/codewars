package kyu7;

public class WithoutTheLetterE {

    public static String findE(String str){
        if (str == null) return null;
        if (str.isEmpty()) return "";

        str = str.toLowerCase();
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') c++;
        }

        return c == 0 ? "There is no \"e\"." : String.valueOf(c);

    }

}
