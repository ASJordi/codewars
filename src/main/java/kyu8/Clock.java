package kyu8;

public class Clock {

    public static int Past(int h, int m, int s) {
//        int hourToSeconds = h * 3600;
//        int minutesToSeconds = m * 60;
//        int time = hourToSeconds + minutesToSeconds + s;
//        return time * 1000;
        return h * 3600000 + m * 60000 + s * 1000;
    }

}
