package kyu7;

public class FindTheIndexOfTheSecondOccurrenceOfALetterInAString {

    public static int secondSymbol(String str, char c) {
        return str.indexOf(c, str.indexOf(c) + 1);
    }

}
