package kyu7;

public class Pandemia {

    public static double infected(String input) {
        int total = input.replace("X", "").length();
        int infected = 0;

        if (!input.contains("1") && !input.contains("0")) return 0.0;
        if (!input.contains("0")) return 100.0;
        if (!input.contains("1")) return 0.0;

        for (String c : input.split("X")) {
            if (c.contains("1")) infected += c.length();
        }

        return (100.0 * infected) / total;
    }

}
