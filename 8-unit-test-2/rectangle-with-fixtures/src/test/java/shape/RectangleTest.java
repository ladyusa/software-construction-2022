package shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    private Rectangle rectangle;

    @BeforeAll
    static void setupAll() {
        System.out.println("****** before all ******");
    }

    @BeforeEach
    void setup() {
        rectangle = new Rectangle(4, 5);
        System.out.println("--- before each ---");
    }

    @Test
    void testArea() {
        assertEquals(20, rectangle.getArea(), "Area must be width * height");
        System.out.println("  test area ");
    }

    @Test
    void testPerimeter() {
        int perimeter = rectangle.getPerimeter();
        assertEquals(18, perimeter);
        System.out.println("  test perimeter ");
    }

    @AfterEach
    void teardown() {
        System.out.println("---- after each ----");
    }

    @AfterAll
    static void teardownAll() {
        System.out.println("****** after all ******");
    }
}
