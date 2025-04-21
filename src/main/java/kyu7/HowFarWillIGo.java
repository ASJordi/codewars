package kyu7;

public class HowFarWillIGo {

    public static int travel(int totalTime, int runTime, int restTime, int speed) {
        int distance = 0;
        int currentTime = 0;

        while (currentTime < totalTime) {
            int runningDuration = Math.min(runTime, totalTime - currentTime);
            distance += runningDuration * speed;
            currentTime += runningDuration;

            if (currentTime < totalTime) {
                int restingDuration = Math.min(restTime, totalTime - currentTime);
                currentTime += restingDuration;
            }
        }

        return distance;
    }

}
