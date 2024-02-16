package rikkei.academy;

public class TriangleClassifier {

    public static String classifyTriangle(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "Not a Triangle";
        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "Not a Triangle";
        } else if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
