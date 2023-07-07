package easy;

public class BlueAndRedMarbles {

    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {

        int blueRemaining = blueStart - bluePulled;
        int redRemaining = redStart - redPulled;
        int totalRemaining = blueRemaining + redRemaining;

        return (float) blueRemaining / totalRemaining;

    }

}
