package kyu7;

public class PrisonBreak {

    public static int freedPrisoners(Boolean[] prison) {
        if (!prison[0]) return 0;
        int count = 0;

        for (int i = 0; i < prison.length; i++) {
            if (prison[i]) {
                count++;
                prison = updatePrison(prison);
            }
        }

        return count;
    }

    public static Boolean[] updatePrison(Boolean[] prison) {
        Boolean[] result = new Boolean[prison.length];
        for (int i = 0; i < prison.length; i++) result[i] = !prison[i];
        return result;
    }

}
