package kyu7;

public class InviteMoreWomen {

    public static boolean inviteMoreWomen(int[] l) {
        int sum = 0;

        for (int j : l) {
            if (j == 1) sum++;
        }

        return sum > l.length / 2;
    }

}
