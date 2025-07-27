package kyu7;

public class TheFirstNonRepeatedCharacterInAString {

    public static Character firstNonRepeated(String source) {

        for (int i = 0; i < source.length(); i++) {
            if (source.indexOf(source.charAt(i)) == source.lastIndexOf(source.charAt(i))) return source.charAt(i);
        }

        return null;
    }

}
