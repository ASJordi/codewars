package kyu7;

public class OrthogonalVectors {

    public static boolean isOrthogonal(int[] u, int[] v){
        int sum = 0;

        for (int i = 0; i < u.length; i++) {
            sum += u[i] * v[i];
        }

        return sum == 0;
    }

}
