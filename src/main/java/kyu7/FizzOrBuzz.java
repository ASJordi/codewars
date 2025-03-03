package kyu7;

public class FizzOrBuzz {

    public static int[] solution(int number) {
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 && i % 5 != 0) a++;
            else if (i % 5 == 0 && i % 3 != 0) b++;
            else if (i % 3 == 0 && i % 5 == 0) c++;
        }

        return new int[]{a, b, c};
    }

}
