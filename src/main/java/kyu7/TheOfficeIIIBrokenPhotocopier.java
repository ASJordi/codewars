package kyu7;

public class TheOfficeIIIBrokenPhotocopier {

    public static String broken(final String x) {
        StringBuilder sb = new StringBuilder();

        for (char c : x.toCharArray()) {
            sb.append(c == '0' ? '1' : '0');
        }

        return sb.toString();
    }

}
