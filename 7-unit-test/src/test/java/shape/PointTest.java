package shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    void testTranslate() {
        Point point = new Point(10, 10);
        point.translate(2, 5);

        assertEquals(12, point.getX());
        assertEquals(15, point.getY());
    }
}
