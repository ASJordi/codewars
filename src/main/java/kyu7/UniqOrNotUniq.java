package kyu7;

import java.util.Arrays;

public class UniqOrNotUniq {

    public static int[] testit(int[] a, int[] b) {
        var da = Arrays.stream(a).distinct().toArray();
        var db = Arrays.stream(b).distinct().toArray();

        int[] result = new int[da.length + db.length];
        System.arraycopy(da, 0, result, 0, da.length);
        System.arraycopy(db, 0, result, da.length, db.length);

        Arrays.sort(result);

        return result;
    }

}
