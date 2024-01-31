package rikkei.academy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(6, 7.5);

        System.out.println();
        System.out.print("Diện tích của hình Tròn: ");
        System.out.println(circle.area());
        System.out.println();
        System.out.print("Diện tích của hình Chữ Nhật: ");
        System.out.println(rectangle.area());
        System.out.println();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(5, 7));

        for (Shape shape : shapes) {
            System.out.println("Diện tích: " + shape.area());
            System.out.println();
        }
    }
}
