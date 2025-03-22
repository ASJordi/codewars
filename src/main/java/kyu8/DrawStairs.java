package kyu8;

public class DrawStairs {

    public static String draw(int n){
        StringBuilder stairs = new StringBuilder();
        int spaces = 0;

        for (int i = 1; i <= n; i++) {
            stairs.append(" ".repeat(spaces++))
                    .append("I")
                    .append("\n");
        }

        return stairs.toString().trim();
    }

}
