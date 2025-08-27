package kyu6;

public class BinaryToTextASCIIConversion {

    public static String binaryToText(String binary) {
        if (binary.isBlank()) return "";

        String[] binaryChunks = binary.split("(?<=\\G.{8})");
        StringBuilder sb = new StringBuilder();

        for (String binaryChunk : binaryChunks) {
            sb.append((char) Integer.parseInt(binaryChunk, 2));
        }

        return sb.toString();
    }

}
