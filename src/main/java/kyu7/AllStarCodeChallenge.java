package kyu7;

public class AllStarCodeChallenge {

    public static String toTime(int seconds) {
        var h = seconds / 3600;
        var m = (seconds % 3600) / 60;
        return String.format("%d hour(s) and %d minute(s)", h, m);
    }

}
