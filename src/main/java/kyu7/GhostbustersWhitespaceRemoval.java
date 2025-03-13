package kyu7;

public class GhostbustersWhitespaceRemoval {

    public static String ghostBusters(String building) {
        return !building.contains(" ") ? "You just wanted my autograph didn't you?" : building.replaceAll("\\s", "");
    }

}
