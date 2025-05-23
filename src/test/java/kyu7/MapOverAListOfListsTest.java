package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MapOverAListOfListsTest {

    private static final Integer[][] num = {{1,2,3,4},{5,6,7,8,9},{0,2,4}};
    private static final Character[][] chr = {{'h','E','l','l','O'},{'w','O','r','L','d'}};

    @Test
    void addition(){
        assertArrayEquals(new Integer[][]{{2,3,4,5},{6,7,8,9,10},{1,3,5}}, MapOverAListOfLists.gridMap(e -> e + 1,num));
    }

    @Test
    void multiplication(){
        assertArrayEquals(new Integer[][]{{2,4,6,8},{10,12,14,16,18},{0,4,8}}, MapOverAListOfLists.gridMap(e -> e * 2,num));
    }

    @Test
    void power(){
        assertArrayEquals(new Integer[][]{{1,4,9,16},{25,36,49,64,81},{0,4,16}}, MapOverAListOfLists.gridMap(e -> (int)Math.pow(e, 2),num));
    }

    @Test
    void upper(){
        assertArrayEquals(new Character[][]{{'H','E','L','L','O'},{'W','O','R','L','D'}}, MapOverAListOfLists.gridMap(e -> Character.toUpperCase(e),chr));
    }

    @Test
    void lower(){
        assertArrayEquals(new Character[][]{{'h','e','l','l','o'},{'w','o','r','l','d'}}, MapOverAListOfLists.gridMap(e -> Character.toLowerCase(e),chr));
    }
    
}
