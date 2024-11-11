package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FillTheHardDiskDriveTest {

    @Test
    public void sampleTests() {
        assertEquals("sizes = [4, 4, 4, 3, 3], hd = 12", 3, FillTheHardDiskDrive.save(new int[]{4, 4, 4, 3, 3}, 12));
        assertEquals("sizes = [4, 4, 4, 3, 3], hd = 11", 2, FillTheHardDiskDrive.save(new int[]{4, 4, 4, 3, 3}, 11));
        assertEquals("sizes = [4, 8, 15, 16, 23, 42], hd = 108", 6, FillTheHardDiskDrive.save(new int[]{4, 8, 15, 16, 23, 42}, 108));
        assertEquals("sizes = [13], hd = 13", 1, FillTheHardDiskDrive.save(new int[]{13}, 13));
        assertEquals("sizes = [1, 2, 3, 4], hd = 250", 4, FillTheHardDiskDrive.save(new int[]{1, 2, 3, 4}, 250));
        assertEquals("sizes = [100], hd = 500", 1, FillTheHardDiskDrive.save(new int[]{100}, 500));
        assertEquals("sizes = [11, 13, 15, 17, 19], hd = 8", 0, FillTheHardDiskDrive.save(new int[]{11, 13, 15, 17, 19}, 8));
        assertEquals("sizes = [45], hd = 12", 0, FillTheHardDiskDrive.save(new int[]{45}, 12));
    }

}
