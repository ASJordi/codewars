package kyu7;

public class GreetMe {

    public static String greet(String name) {
        String capName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        return "Hello " + capName + "!";
    }

}
