package kyu7;

public class FindScreenSize {

    public static String findScreenHeight(int width, String ratio) {
        StringBuilder result = new StringBuilder();
        int rat1 = Integer.parseInt(ratio.split(":")[0]);
        int rat2 = Integer.parseInt(ratio.split(":")[1]);

        int height = width * rat2 / rat1;

        result.append(width).append("x").append(height);

        return result.toString();
    }

}
