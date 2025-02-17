package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindOutWhetherTheShapeIsACubeTest {

    @Test
    public void sampleTest() {
        assertFalse(FindOutWhetherTheShapeIsACube.isCube(12, 2), "For input (12, 2)");
        assertFalse(FindOutWhetherTheShapeIsACube.isCube(8, 3), "For input (8, 3)");
        assertTrue(FindOutWhetherTheShapeIsACube.isCube(8, 2), "For input (8, 2)");
        assertFalse(FindOutWhetherTheShapeIsACube.isCube(-8, -2), "For input (-8, -2)");
        assertFalse(FindOutWhetherTheShapeIsACube.isCube(0, 0), "For input (0, 0)");
        assertTrue(FindOutWhetherTheShapeIsACube.isCube(27, 3), "For input (27, 3)");
        assertFalse(FindOutWhetherTheShapeIsACube.isCube(1, 5), "For input (1, 5)");
        assertTrue(FindOutWhetherTheShapeIsACube.isCube(125, 5), "For input (125, 5)");
        assertFalse(FindOutWhetherTheShapeIsACube.isCube(125, -5), "For input (125, -5)");
        assertFalse(FindOutWhetherTheShapeIsACube.isCube(0, 12), "For input (0, 12)");
        assertFalse(FindOutWhetherTheShapeIsACube.isCube(12, -1), "For input (12, -1)");
        assertTrue(FindOutWhetherTheShapeIsACube.isCube(1, 1), "For input (1, 1)");
    }

}
