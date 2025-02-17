package kyu7;

public class HowLongShouldYouCookThisFor {

    public static String getTime(String neededPower, int minutes, int seconds, String power) {
        int np = Integer.parseInt(neededPower.replace("W", ""));
        int p = Integer.parseInt(power.replace("W", ""));
        seconds = (int) Math.ceil((seconds + (60.0 * minutes)) * np / p);
        return seconds / 60 + " minutes " + seconds % 60 + " seconds";
    }

}
