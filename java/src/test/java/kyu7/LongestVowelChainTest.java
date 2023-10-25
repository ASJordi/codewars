package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LongestVowelChainTest {

    @Test
    public void basicTests(){
        assertEquals(3, LongestVowelChain.solve("ultrarevolutionariees"));
        assertEquals(2, LongestVowelChain.solve("codewarriors"));
        assertEquals(3, LongestVowelChain.solve("suoidea"));
        assertEquals(1, LongestVowelChain.solve("strengthlessnesses"));
        assertEquals(11, LongestVowelChain.solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));
    }


}
