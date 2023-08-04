package kyu7;

public class CaffeineScript {

    public static String caffeineBuzz(int n){
        if (n % 3 == 0 && n % 4 == 0) {
            if (n % 2 == 0) return "CoffeeScript";
            return "Coffee";
        }

        if (n % 3 == 0) {
            if (n % 2 == 0) return "JavaScript";
            return "Java";
        }

        return "mocha_missing!";
//        return n % 12 == 0 ? "CoffeeScript" : n % 6 == 0 ? "JavaScript" : n % 3 == 0 ? "Java" : "mocha_missing!";
    }

}
