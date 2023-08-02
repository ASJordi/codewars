package kyu7;

public class FilterTheNumber {

    public static long filterString(final String value) {
        String res = "";

        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))){
                res += value.charAt(i);
            }
        }
        return Long.parseLong(res);
//        return Long.valueOf(value.replaceAll("\\D", ""));
    }

}
