package kyu7;

public class ReturnSubstringInstanceCount {

    public static int substringCount(String fullText, String search) {
        StringBuilder sb = new StringBuilder(fullText);
        int count = 0;

        while (sb.indexOf(search) != -1) {
            count++;
            int i = sb.indexOf(search);
            sb.delete(i, i + search.length());
        }

        return count;
    }

}
