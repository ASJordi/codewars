package kyu7;

public class MontyHallProblem {

    public int montyHallCase(int correctDoorNumber, int[] participantGuesses) {
        int wrongDoorNumber = 0;

        for (int p : participantGuesses) if (p != correctDoorNumber) wrongDoorNumber++;

        return Math.round((100f * wrongDoorNumber) / participantGuesses.length);
    }

}
