package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FindOutWhetherTheShapeIsACubeTest {

    @Test
    public void sampleTest() {
        assertFalse("For input (12, 2)", FindOutWhetherTheShapeIsACube.isCube(12, 2));
        assertFalse("For input (8, 3)", FindOutWhetherTheShapeIsACube.isCube(8, 3));
        assertTrue("For input (8, 2)", FindOutWhetherTheShapeIsACube.isCube(8, 2));
        assertFalse("For input (-8, -2)", FindOutWhetherTheShapeIsACube.isCube(-8, -2));
        assertFalse("For input (0, 0)", FindOutWhetherTheShapeIsACube.isCube(0, 0));
        assertTrue("For input (27, 3)", FindOutWhetherTheShapeIsACube.isCube(27, 3));
        assertFalse("For input (1, 5)", FindOutWhetherTheShapeIsACube.isCube(1, 5));
        assertTrue("For input (125, 5)", FindOutWhetherTheShapeIsACube.isCube(125, 5));
        assertFalse("For input (125, -5)", FindOutWhetherTheShapeIsACube.isCube(125, -5));
        assertFalse("For input (0, 12)", FindOutWhetherTheShapeIsACube.isCube(0, 12));
        assertFalse("For input (12, -1)", FindOutWhetherTheShapeIsACube.isCube(12, -1));
        assertTrue("For input (1, 1)", FindOutWhetherTheShapeIsACube.isCube(1, 1));
    }

}
