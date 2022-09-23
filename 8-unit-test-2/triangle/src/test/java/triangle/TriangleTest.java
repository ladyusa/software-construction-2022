package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    void testTriangleTypeEquilateral() {
        assertEquals(TriangleType.EQUILATERAL, Triangle.getType(5, 5, 5));
    }
    @Test
    void testTriangleTypeInvalid() {
        assertEquals(TriangleType.INVALID, Triangle.getType(5, 5, -4));
    }
    @Test
    void testTriangleTypeIsosceles() {
        assertEquals(TriangleType.ISOSCELES, Triangle.getType(5, 5, 3));
    }
    @Test
    void testTriangleTypeScalene() {
        assertEquals(TriangleType.SCALENE, Triangle.getType(3, 4, 5));
    }
}
