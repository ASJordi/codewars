package kyu7;

public class DigitsExplosion {

    public static String explode(String digits) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < digits.length(); i++) {
            String n = Character.toString(digits.charAt(i));
            res.append(n.repeat(Integer.parseInt(n)));
        }

        return res.toString();
    }

}
