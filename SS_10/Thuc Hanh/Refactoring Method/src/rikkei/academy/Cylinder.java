package rikkei.academy;

public class Cylinder { // Cylinder: Hình trụ
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = getVolume(height, perimeter, baseArea);
        return volume; // volume: Thể tích
    }

    private static double getVolume(int height, double perimeter, double baseArea) {
        double volume = perimeter * height * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius) {
        double perimeter = 2 * Math.PI * radius; // perimeter: Chu vi
        return perimeter;
    }

    private static double getBaseArea(int radius) {
        double baseArea = Math.PI * radius * radius; // base area: Diện tích đáy
        return baseArea;
    }
}
