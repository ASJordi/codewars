package kyu7;

public class CIsForCodewars {

    public static String generateC(int size) {
        StringBuilder c = new StringBuilder();
        StringBuilder tb = new StringBuilder();
        int len = size * 5;

        for (int i = 0; i < size; i++) {
            tb.append("C".repeat(len)).append("\n");
        }

        c.append(tb);

        for (int i = 0; i < len - (size * 2); i++) {
            c.append("C".repeat(size)).append("\n");
        }

        c.append(tb);

        return c.toString().trim();
    }

}
