package kyu7;

public class DroneFlyBy {

    public static String flyBy(String lamps, String drone) {
        return "o".repeat(Math.min(lamps.length(), drone.length())) + (lamps.length() > drone.length() ? lamps.substring(drone.length()) : "");
    }

}
