package kyu7;

public class ComplementaryDNA {

    public static String makeComplement(String dna) {
        StringBuilder newDNA = new StringBuilder();

        for (char c : dna.toCharArray()) {
            if (c == 'A') newDNA.append("T");
            if (c == 'T') newDNA.append("A");
            if (c == 'C') newDNA.append("G");
            if (c == 'G') newDNA.append("C");
        }

        return newDNA.toString();
    }

}
