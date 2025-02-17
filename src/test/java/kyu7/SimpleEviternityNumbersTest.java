package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleEviternityNumbersTest {

    private static Random random = new Random();

    @Test
    public void basicTests(){
        assertEquals(4, SimpleEviternityNumbers.solve(1,100));
        assertEquals(14, SimpleEviternityNumbers.solve(1,1000));
        assertEquals(37, SimpleEviternityNumbers.solve(1,10000));
        assertEquals(103, SimpleEviternityNumbers.solve(1,100000));
    }

    private static int random(int l, int u){
        return random.nextInt(u-l)+l;
    }

    private static int lop9(int a, int b){
        int c = 0;
        while (a < b){
            int x = 0, y = 0, z = 0, flag = 1;
            char[] t = String.valueOf(a).toCharArray();
            for (char ch : t){
                if (ch == '8') x++;
                else if (ch == '5') y++;
                else if (ch == '3') z++;
                else flag = 0;
            }
            if (x >= y && y >= z && flag == 1) c++;
            a++;
        }
        return c;
    }

    @Test
    public void randomTests(){
        for(int i=0;i<100;i++){
            int a = random(1,100);
            int b = random(a+100,499999);
            assertEquals(lop9(a,b), SimpleEviternityNumbers.solve(a,b));
        }
    }

}
