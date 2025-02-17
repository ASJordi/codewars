package kyu7;

public class Block {

    private final int width;
    private final int length;
    private final int height;

    public Block(int[] dimensions) {
        this.width = dimensions[0];
        this.length = dimensions[1];
        this.height = dimensions[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return this.width * this.height * this.length;
    }

    public int getSurfaceArea() {
        return 2 * (this.width * this.length + this.length * this.height + this.width * this.height);
    }
}
