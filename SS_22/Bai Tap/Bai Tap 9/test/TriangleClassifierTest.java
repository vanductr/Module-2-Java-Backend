import org.junit.jupiter.api.Test;
import rikkei.academy.TriangleClassifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {

    @Test
    void testClassifyTriangleEquilateral() {
        // Arrange
        int side1 = 5;
        int side2 = 5;
        int side3 = 5;
        String expected = "Equilateral";

        // Act
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangleIsosceles() {
        // Arrange
        int side1 = 5;
        int side2 = 5;
        int side3 = 6;
        String expected = "Isosceles";

        // Act
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangleScalene() {
        // Arrange
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        String expected = "Scalene";

        // Act
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangleNotATriangle() {
        // Arrange
        int side1 = 1;
        int side2 = 2;
        int side3 = 3;
        String expected = "Not a Triangle";

        // Act
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);

        // Assert
        assertEquals(expected, result);
    }
}

