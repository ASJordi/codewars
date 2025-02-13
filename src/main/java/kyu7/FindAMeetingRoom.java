package kyu7;

public class FindAMeetingRoom {

    public static Object meeting(char[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'O') return i;
        }

        return "None available!";
    }

}
