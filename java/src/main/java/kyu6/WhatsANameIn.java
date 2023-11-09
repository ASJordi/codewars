package kyu6;

public class WhatsANameIn {

    public static boolean nameInStr(String str, String name){
        StringBuilder result = new StringBuilder();
        int index = 0;

        for (char c : str.toLowerCase().toCharArray()){
            if (c == name.charAt(index)){
                result.append(c);
                index++;
            }
        }

        return result.toString().equals(name);
    }

}
