package kyu7;

public class ExesAndOhs {

    public static boolean getXO (String str) {
        str = str.toLowerCase();

        int countX = 0;
        int countO = 0;

        for (char c : str.toCharArray()){
            if (c == 'x') countX++;
            if (c == 'o') countO++;
        }

        return countX == countO;
    }

}
