package kyu7;

public class GameInput {

    public float[] getVector(boolean[] wasd) {
        float positionX = 0f;
        float positionY = 0f;

        if (wasd[0]) positionY++;
        if (wasd[3]) positionX++;
        if (wasd[2]) positionY--;
        if (wasd[1]) positionX--;

        return positionX != 0 && positionY != 0 ? new float[]{positionX * .70710677f, positionY * .70710677f} : new float[]{positionX, positionY};
    }

}
