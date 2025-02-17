package kyu8;

public class GhostCode {

    public static String helloName(final String name) {
        return name == "" || name == null ? "Hello world!" : "Hello my name is " + name;
    }

}
