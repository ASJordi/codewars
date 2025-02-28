package kyu8;

public class TotalPoints {

    public static int points(String[] games) {

        int points = 0;

        for (String res : games) {
            String[] scores = res.split(":");
            int x = Integer.parseInt(scores[0]);
            int y = Integer.parseInt(scores[1]);

            if (x > y) {
                points += 3;
            } else if (x == y) {
                points += 1;
            }
        }

        return points;
    }

}
