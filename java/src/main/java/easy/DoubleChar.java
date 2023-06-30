package easy;

public class DoubleChar {

    public static String doubleChar(String s){

        StringBuilder doubleWord = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            doubleWord.append(s.charAt(i)).append(s.charAt(i));

        }

        return doubleWord.toString();

//        s = s.replace(" ", "~");
//        String[] strArray = s.split(" ");
//        StringBuilder doubleWord = new StringBuilder();
//
//        for (String word : strArray) {
//            char[] letter = word.toCharArray();
//            for (char c : letter) {
//                doubleWord.append(String.valueOf(c).repeat(2));
//            }
//        }
//
//        return doubleWord.toString().replace("~", " ");

    }

}
