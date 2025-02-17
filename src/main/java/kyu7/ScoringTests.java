package kyu7;

public class ScoringTests {

    public static int sol(int[] arr, int r, int o, int w) {
        int correctAnswer = 0;
        int omittedAnswer = 0;
        int incorrectAnswer = 0;

        for (int answer : arr) {
            if (answer == 0) correctAnswer++;
            if (answer == 1) omittedAnswer++;
            if (answer == 2) incorrectAnswer++;
        }

        return (correctAnswer * r) - (incorrectAnswer * w) + (omittedAnswer * o);
    }

}
