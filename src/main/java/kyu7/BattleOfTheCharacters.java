package kyu7;

public class BattleOfTheCharacters {

    public static String battle(final String x, final String y) {
        int xPower = 0;
        int yPower = 0;

        for (int i = 0; i < x.length(); i++) {
            xPower += x.charAt(i) - 'A' + 1;
        }

        for (int i = 0; i < y.length(); i++) {
            yPower += y.charAt(i) - 'A' + 1;
        }

        return xPower > yPower ? x : xPower < yPower ? y : "Tie!";
    }

}
