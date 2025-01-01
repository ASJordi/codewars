package kyu8;

public class TheIfFunction {

    public static void _if(Boolean bool, Runnable func1, Runnable func2) {
        if (bool != null && bool) func1.run();
        else func2.run();
    }

}
