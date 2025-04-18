package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheMissingNumberTest {

    @Test
    public void basicTest() {
        assertEquals(5, FindTheMissingNumber.missingNo(new int[]{0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100}));
        assertEquals(10, FindTheMissingNumber.missingNo(new int[]{81, 73, 3, 51, 48, 66, 43, 23, 27, 14, 54, 21, 68, 64, 17, 20, 80, 87, 44, 33, 39, 93, 60, 52, 55, 18, 91, 100, 95, 53, 69, 63, 82, 0, 24, 41, 6, 9, 86, 22, 1, 98, 15, 62, 36, 35, 57, 16, 70, 13, 4, 76, 88, 47, 11, 65, 96, 67, 58, 34, 59, 61, 79, 72, 25, 75, 77, 78, 85, 19, 49, 2, 97, 5, 37, 83, 12, 84, 8, 89, 90, 38, 26, 50, 31, 71, 56, 29, 46, 45, 74, 32, 94, 30, 42, 40, 7, 92, 28, 99}));
    }

}
