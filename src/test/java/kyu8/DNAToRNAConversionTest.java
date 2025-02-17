package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DNAToRNAConversionTest {

    @Test
    public void testDna() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }

}
