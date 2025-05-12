package kyu7;

public class MakeMeSlow {

    public static void makeMeSlow() {
        new Thread(() -> {
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).run();
    }

}
