package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitsBattleTest {

    @Test
    public void testBasicExamples() {
      assertEquals("odds win", BitsBattle.bitsBattle(new int[]{5, 3, 14}));
      assertEquals("evens win", BitsBattle.bitsBattle(new int[]{3, 8, 22, 15, 78}));
      assertEquals("tie", BitsBattle.bitsBattle(new int[]{}));
      assertEquals("tie", BitsBattle.bitsBattle(new int[]{1, 13, 16}));
      assertEquals("tie", BitsBattle.bitsBattle(new int[]{0}));
    }
    
}
