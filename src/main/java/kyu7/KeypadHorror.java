package kyu7;

import java.util.HashMap;

public class KeypadHorror {

    public static String computerToPhone(String number){
        StringBuilder res = new StringBuilder();
        HashMap<String, String> keyboard = new HashMap<>();
        keyboard.put("7", "1");
        keyboard.put("8", "2");
        keyboard.put("9", "3");
        keyboard.put("4", "4");
        keyboard.put("5", "5");
        keyboard.put("6", "6");
        keyboard.put("1", "7");
        keyboard.put("2", "8");
        keyboard.put("3", "9");
        keyboard.put("0", "0");

        for (int i = 0; i < number.length(); i++) {
            String num = Character.toString(number.charAt(i));
            if (keyboard.containsKey(num)){
                res.append(keyboard.get(num));
            }
        }

        return res.toString();
    }

}
