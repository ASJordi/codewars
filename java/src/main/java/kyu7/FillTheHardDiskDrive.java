package kyu7;

public class FillTheHardDiskDrive {

    public static int save(int[] sizes, int hd) {
        int counter = 0;
        int sum = 0;

        for (int size : sizes) {
            sum += size;
            if (sum <= hd) counter++;
        }

        return counter;
    }
}
