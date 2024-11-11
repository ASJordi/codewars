package kyu7;

import static java.util.regex.Pattern.compile;

public class WheresWally {

    public static int wheresWally(String str) {
        var matcher = compile("(?<=^| )Wally(?!\\w)").matcher(str);
        return matcher.find() ? matcher.start() : -1;
    }

}
