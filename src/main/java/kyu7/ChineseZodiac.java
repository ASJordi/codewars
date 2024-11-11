package kyu7;

public class ChineseZodiac {

    public static String chineseZodiac(int year) {
        String[] animals = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
        String[] elements = {"Wood", "Fire", "Earth", "Metal", "Water"};
        int diff = year - 1924;
        return elements[(diff / 2) % (elements.length)] + " " + animals[diff % animals.length];
    }

}
