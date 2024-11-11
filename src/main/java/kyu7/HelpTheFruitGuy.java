package kyu7;

public class HelpTheFruitGuy {

    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null || fruitBasket.length == 0) return new String[]{};
        String[] fruits = new String[fruitBasket.length];

        for (int i = 0; i < fruitBasket.length; i++) {
            fruits[i] = fruitBasket[i].replace("rotten", "").toLowerCase();
        }

        return fruits;
    }

}
