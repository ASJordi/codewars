package easy;

import java.util.Arrays;
import java.util.Collections;

public class WolvesAndSheep {

    public static String warnTheSheep(String[] array) {

//        String msg = "";
//
//        if (array[array.length - 1].equals("wolf")) return "Pls go away and stop eating my sheep";
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].equals("wolf") && (array[i + 1].equals("sheep"))){
//                    msg = "Oi! Sheep number " + (array.length - (i + 1)) + "! You are about to be eaten by a wolf!";
//                    break;
//            }
//        }
//
//        return msg;

        Collections.reverse(Arrays.asList(array));
        int pos = Arrays.asList(array).indexOf("wolf");
        return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";

    }

}
