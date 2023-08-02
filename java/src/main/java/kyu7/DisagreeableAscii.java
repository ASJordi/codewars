package kyu7;

public class DisagreeableAscii {

    public static int getWeight(String name){
        StringBuilder newName = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))){
                if (Character.isUpperCase(name.charAt(i))) newName.append(Character.toString(name.charAt(i)).toLowerCase());
                else newName.append(Character.toString(name.charAt(i)).toUpperCase());
            }
        }

        for (int i = 0; i < newName.length(); i++) {
            sum += newName.charAt(i);
        }

        return sum;
    }

}
