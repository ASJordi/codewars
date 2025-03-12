package kyu7;

public class CharCodeCalculation {

    public static int calc(String x){
        StringBuilder total1 = new StringBuilder();

        for (char c : x.toCharArray()) {
            total1.append((int) c);
        }

        String total2 = total1.toString().replace('7', '1');

        var a = total1.chars().map(Character::getNumericValue).sum();
        var b = total2.chars().map(Character::getNumericValue).sum();

        return a - b;
    }

}
