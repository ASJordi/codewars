package kyu7;

public class BoiledEggs {

    public static int cookingTime(int eggs){
        return (eggs / 8) * 5 + (eggs % 8 == 0 ? 0 : 5);
    }

}
