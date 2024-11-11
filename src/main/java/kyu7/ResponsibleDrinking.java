package kyu7;

public class ResponsibleDrinking {

    public String hydrate(String drinkString) {
        int sum = 0;

        for (int i = 0; i < drinkString.length(); i++) {
            String s = Character.toString(drinkString.charAt(i));
            if (isNumeric(s)) sum += Integer.parseInt(s);
        }

        return sum > 1 ? (sum + " glasses of water") : (sum + " glass of water");
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

}
