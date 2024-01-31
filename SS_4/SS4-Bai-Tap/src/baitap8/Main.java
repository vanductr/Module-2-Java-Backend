package baitap8;

public class Main {
    public static void main(String[] args) {
        // Tính diện tích hình tròn
        double circleArea1 = StaticMethod.calCircleArea(3.5);
        double circleArea2 = StaticMethod.calCircleArea(6);

        System.out.println("Diện tích hình tròn (bán kính 3.5): " + circleArea1);
        System.out.println("Diện tích hình tròn (bán kính 6): " + circleArea2);

        // Tính diện tích hình tam giác
        double triangleArea1 = StaticMethod.calTriangleArea(3, 4, 5);
        double triangleArea2 = StaticMethod.calTriangleArea(4.5, 7, 6);

        System.out.println("Diện tích tam giác (3, 4, 5): " + triangleArea1);
        System.out.println("Diện tích tam giác (4.5, 7, 6): " + triangleArea2);

        // Tính diện tích hình chữ nhật
        double rectangleArea1 = StaticMethod.calRectangleArea(2.5, 6);
        double rectangleArea2 = StaticMethod.calRectangleArea(4, 7);

        System.out.println("Diện tích hình chữ nhật (2.5, 6): " + rectangleArea1);
        System.out.println("Diện tích hình chữ nhật (4, 7): " + rectangleArea2);
    }
}

