package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalDecompositionTest {

    @Test
    public void basicTests(){
        assertEquals("100+20+6", DecimalDecomposition.decimalDecomposition(126));
        assertEquals("100", DecimalDecomposition.decimalDecomposition(100));
        assertEquals("1000+200+10", DecimalDecomposition.decimalDecomposition(1210));
        assertEquals("700000+10000+2000+600+50+4", DecimalDecomposition.decimalDecomposition(712654));
    }

    @Test
    public void randomTests(){
        DecimalDe d = new DecimalDe();

        for(int i=0; i<100; i++){
            int numb = (int)Math.ceil(Math.random()*100000);
            assertEquals(d.decimalDecomposition(numb),
                    DecimalDecomposition.decimalDecomposition(numb));


        }

    }

    private class DecimalDe{
        public String decimalDecomposition(int number){
            String num = number+"";
            String aux = "";
            for (int i = 0; i < num.length(); i++) {
                aux += num.charAt(i);
                for (int j = 1; j < num.length() - i; j++) {
                    aux += "0";
                }
                aux+="+";

            }
            aux = aux.substring(0,aux.length()-1);
            String[] ar = aux.split("\\+");
            aux = "";
            for (int i = 0; i < ar.length; i++) {
                if(Integer.parseInt(ar[i])!=0){
                    aux += ar[i]+"+";
                }
            }
            return aux.substring(0,aux.length()-1);
        }
    }
}
