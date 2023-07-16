package kyu8;

public class JustCountSheep {

    public static String countingSheep(int num) {

        StringBuilder msg = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            msg.append(i).append(" sheep...");
        }

        return msg.toString();
    }

}
