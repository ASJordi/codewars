package kyu8;

public class ANeedleInTheHaystack {

    public static String findNeedle(Object[] haystack) {

//        String msg = "";
//
//        for (int i = 0; i < haystack.length; i++) {
//            if (haystack[i] != null && haystack[i].equals("needle")){
//                msg = "found the needle at position " + i;
//            }
//        }
//
//        return msg;

        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));

    }

}
