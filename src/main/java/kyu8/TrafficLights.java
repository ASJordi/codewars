package kyu8;

import java.util.Objects;

public class TrafficLights {

    public static String updateLight(String current) {

        return Objects.equals(current, "green") ? "yellow" :
                Objects.equals(current, "yellow") ? "red" :
                Objects.equals(current, "red") ? "green" : current;

    }

}
