package easy;

public class TheTernaryOperator {

    public static String describeAge(int a) {
        return "You're a(n) " + (a <= 12 ? "kid" : a <= 17 ? "teenager" : a <= 64 ? "adult" : "elderly");
    }

}
