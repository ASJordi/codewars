package kyu7;

public class LunarMathematicsAddition {

    public static long add(long number1, long number2) {
        StringBuilder n1 = new StringBuilder(String.valueOf(number1));
        StringBuilder n2 = new StringBuilder(String.valueOf(number2));
        StringBuilder num = new StringBuilder();

        int n1Len = n1.length();
        int n2Len = n2.length();

        if (n1Len < n2Len){
            int diff = n2Len - n1Len;
            n1.insert(0, "0".repeat(diff));
        } else if (n2Len < n1Len){
            int diff = n1Len - n2Len;
            n2.insert(0, "0".repeat(diff));
        }

        for (int i = 0; i < n1.length(); i++) {
            num.append(Math.max(Integer.parseInt(Character.toString(n1.toString().charAt(i))), Integer.parseInt(Character.toString(n2.toString().charAt(i)))));
        }

        return Long.parseLong(num.toString());
    }

}
