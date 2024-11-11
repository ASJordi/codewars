package kyu7;

public class CheckThreeAndTwo {

    public boolean checkThreeAndTwo(char[] chars) {
        int numA = 0;
        int numB = 0;
        int numC = 0;

        for (char c : chars){
            if (c == 'a') numA++;
            if (c == 'b') numB++;
            if (c == 'c') numC++;
        }

        return (numA == 3 || numB == 3 || numC == 3) && (numA == 2 || numB == 2 || numC == 2);
    }
}
