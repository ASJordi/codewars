package kyu7;

public class SimpleStringCharacters {

    public static int[] Solve(String word) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numbersCaseCount = 0;
        int specialCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) upperCaseCount++;
            else if (Character.isLowerCase(c)) lowerCaseCount++;
            else if (Character.isDigit(c)) numbersCaseCount++;
            else specialCount++;
        }

        return new int[]{upperCaseCount, lowerCaseCount, numbersCaseCount, specialCount};
    }

}
