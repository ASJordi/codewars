package kyu7;

public class PowersOfI {

    public static String pofi(int n) {
        return (n % 4 > 1 ? "-" : "") + (n % 2 == 0 ? "1" : "i");
    }

}
