package kyu7;

public class ReversingFun {

    public static String funReverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        for (int i = 1; i < sb.length(); i++) {
            StringBuilder tmp = new StringBuilder();
            tmp.append(sb.substring(i));
            tmp.reverse();
            tmp.insert(0, sb.substring(0, i));
            sb = tmp;
        }

        return sb.toString();
    }

}
