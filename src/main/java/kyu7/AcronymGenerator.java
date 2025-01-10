package kyu7;

public class AcronymGenerator {

    public static String createAcronym(String lastName, String firstName) {
        String[] lastNameParts = lastName.split("[-\\s]");
        String[] firstNameParts = firstName.split("[-\\s]");

        StringBuilder acronym = new StringBuilder();

        for (String first : firstNameParts) {
            if (!first.trim().isEmpty()) acronym.append(Character.toUpperCase(first.charAt(0)));
        }

        for (String last : lastNameParts) {
            if (last.equalsIgnoreCase("von")) acronym.append('v');
            else acronym.append(Character.toUpperCase(last.charAt(0)));
        }

        return acronym.toString();
    }

}
