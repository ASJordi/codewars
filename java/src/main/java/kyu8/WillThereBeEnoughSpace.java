package kyu8;

public class WillThereBeEnoughSpace {

    public static int enough(int cap, int on, int wait) {

        int actualCap = cap - on;
        return (actualCap > wait) ? 0 : wait - actualCap;

    }

}
