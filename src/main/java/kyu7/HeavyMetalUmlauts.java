package kyu7;

public class HeavyMetalUmlauts {

    public static String heavyMetalUmlauts(String boringText){
        return boringText
                .replace("A", "\u00c4")
                .replace("E", "\u00cb")
                .replace("I", "\u00cf")
                .replace("O", "\u00d6")
                .replace("U", "\u00dc")
                .replace("Y", "\u0178")
                .replace("a", "\u00e4")
                .replace("e", "\u00eb")
                .replace("i", "\u00ef")
                .replace("o", "\u00f6")
                .replace("u", "\u00fc")
                .replace("y", "\u00ff");
    }

}
