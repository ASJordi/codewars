package kyu7;

public class AlternateCapitalization {

    public static String[] capitalize(String s){
        StringBuilder stringEven = new StringBuilder();
        StringBuilder stringOdd = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0){
                stringEven.append(Character.toString(s.charAt(i)).toUpperCase());
                stringOdd.append(s.charAt(i));
            } else {
                stringEven.append(s.charAt(i));
                stringOdd.append(Character.toString(s.charAt(i)).toUpperCase());
            }
        }

        return new String[]{stringEven.toString(), stringOdd.toString()};
    }

}
