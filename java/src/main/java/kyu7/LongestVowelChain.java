package kyu7;

public class LongestVowelChain {

    public static int solve(String s){
        String vowels = "aeiou";
        StringBuilder temp = new StringBuilder();
        int max = 0;

        for (char c : s.toCharArray()){
            if (!vowels.contains(Character.toString(c))) temp.append("-");
            else temp.append(c);
        }

        String[] arr = temp.toString().split("-");

        for (String c : arr) if (c.length() > max) max = c.length();

        return max;
    }

}
