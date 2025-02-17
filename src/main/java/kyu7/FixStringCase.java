package kyu7;

public class FixStringCase {

    public static String solve(final String str) {
        int numOfUpperCase = 0;
        int numOfLowerCase = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) numOfUpperCase++;
            else numOfLowerCase++;
        }
        return numOfUpperCase == numOfLowerCase ? str.toLowerCase() :
                numOfUpperCase > numOfLowerCase ? str.toUpperCase() :
                        str.toLowerCase();
//        return str.chars().filter(Character::isLowerCase).count() >= str.chars().filter(Character::isUpperCase).count()
//                ? str.toLowerCase()
//                : str.toUpperCase();
    }

}
