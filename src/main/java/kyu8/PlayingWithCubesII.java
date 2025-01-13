package kyu8;

public class PlayingWithCubesII {

    private int side;

    public PlayingWithCubesII() {
        this.side = 0;
    }

    public PlayingWithCubesII(int side) {
        this.side = Math.abs(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = Math.abs(side);
    }

}
