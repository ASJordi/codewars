package kyu8;

public class SurfaceAreaAndVolumeOfABox {

    public static int[] getSize(int w,int h,int d) {

        int surfaceArea = 2 * ((w * d) + (d * h) + (w * h));
        int volume = w * h * d;

        return new int[]{surfaceArea, volume};

    }

}
