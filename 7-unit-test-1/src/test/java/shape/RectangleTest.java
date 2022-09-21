package shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void testArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.getArea(), "Area must be width * height");
    }

    @Test
    void testPerimeter() {
        Rectangle rectangle = new Rectangle(4,5);
        int perimeter = rectangle.getPerimeter();

        assertEquals(18, perimeter);
    }
}
