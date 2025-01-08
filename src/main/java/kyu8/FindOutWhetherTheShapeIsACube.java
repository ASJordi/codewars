package kyu8;

public class FindOutWhetherTheShapeIsACube {

    public static boolean isCube(int volume, int side) {
        return volume > 0 && side > 0 && volume == Math.pow(side, 3);
    }

}
