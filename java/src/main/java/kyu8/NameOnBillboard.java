package kyu8;

public class NameOnBillboard {

    public static int billboard(String name, int price) {
        int total = 0;
        for (char c : name.toCharArray()) total += price;
        return total;
    }

}
