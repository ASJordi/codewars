package kyu7;

import java.util.HashMap;

public class AlphabetWar {

    public static String alphabetWar(String fight){
        int rightSide = 0;
        int leftSide = 0;
        HashMap<Character, Integer> powersLeft = new HashMap<>();
        HashMap<Character, Integer> powersRight = new HashMap<>();
        powersLeft.put('w', 4); powersLeft.put('p', 3);
        powersLeft.put('b', 2); powersLeft.put('s', 1);
        powersRight.put('m', 4); powersRight.put('q', 3);
        powersRight.put('d', 2); powersRight.put('z', 1);

        for (Character c : fight.toCharArray()){
            if (powersLeft.containsKey(c)) leftSide += powersLeft.get(c);
            if (powersRight.containsKey(c)) rightSide += powersRight.get(c);
        }

        return leftSide > rightSide ? "Left side wins!" :
                rightSide > leftSide ? "Right side wins!" :
                        "Let's fight again!";
    }

}
