package kyu7;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericInheritanceTest {

    @Test
    public void shouldWorkForShapes() {
        List<Shape> shapes = List.of(
                new Circle(2), new Rectangle(3, 3), new Square(2)
        );
        assertEquals(25.567, GenericInheritance.sumAllAreas(shapes), 1e-2);
    }

    @Test
    public void shouldWorkForCircles() {
        List<Circle> circles = List.of(
                new Circle(2), new Circle(1), new Circle(5)
        );
        assertEquals(94.247, GenericInheritance.sumAllAreas(circles), 1e-2);
    }

    @Test
    public void shouldWorkForRectangles() {
        List<Rectangle> rectangles = List.of(
                new Rectangle(3, 1), new Square(2), new Rectangle(1, 2)
        );
        assertEquals(9.0, GenericInheritance.sumAllAreas(rectangles), 1e-2);
    }

}
