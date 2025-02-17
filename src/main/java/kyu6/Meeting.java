package kyu6;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Meeting {

    public static String meeting(String s) {
        return Stream.of(s.toUpperCase().split(";")).map(i -> i.replaceAll("(\\w+):(\\w+)", "($2, $1)")).sorted().collect(joining());
    }

}
