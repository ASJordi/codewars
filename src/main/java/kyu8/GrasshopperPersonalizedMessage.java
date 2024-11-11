package kyu8;

import java.util.Objects;

public class GrasshopperPersonalizedMessage {

    public static String greet(String name, String owner) {

        return (Objects.equals(name, owner)) ? "Hello boss" : "Hello guest";

    }

}
