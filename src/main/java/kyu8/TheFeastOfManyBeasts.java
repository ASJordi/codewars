package kyu8;

public class TheFeastOfManyBeasts {

    public static boolean feast(String beast, String dish) {

        char[] animalCharacters = beast.toCharArray();
        char[] dishCharacters = dish.toCharArray();

        return ((animalCharacters[0] == dishCharacters[0]) && (animalCharacters[animalCharacters.length - 1] == dishCharacters[dishCharacters.length - 1]));

    }

}
