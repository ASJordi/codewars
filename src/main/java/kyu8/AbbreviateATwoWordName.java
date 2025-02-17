package kyu8;

public class AbbreviateATwoWordName {

    public static String abbrevName(String name) {

        String[] names = name.split(" ");
//        StringBuilder abbreviateName = new StringBuilder();
//
//        for (String s : names) {
//            abbreviateName.append(s.charAt(0)).append(".");
//        }

//        return abbreviateName.deleteCharAt(abbreviateName.length() - 1).toString().toUpperCase();
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }

}
