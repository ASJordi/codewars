package kyu7;

public class ConvertTimeToString {

    public static String convertTime(int timeDiff) {
        int days = timeDiff / 86400;
        int hours = timeDiff % 86400 / 3600;
        int minutes = (timeDiff % 3600) / 60;
        int seconds = timeDiff % 60;
        return String.format("%s %s %s %s", days, hours, minutes, seconds);
    }

}
