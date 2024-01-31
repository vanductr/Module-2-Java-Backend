package baitap9;

public class Circle {
    private double radius;
    private String color;

    // Hàm tạo không tham số
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Hàm tạo có tham số là radius
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

//    // Phương thức getter cho radius - Bổ từ truy cập: public.
//    public double getRadius() {
//        return radius;
//    }
//
//    // Phương thức getter cho diện tích (Area) - Bổ từ truy cập: public.
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }

    // Phương thức getter cho radius và diện tích.
    // Phương thức getter cho radius (private)
    private double getRadius() {
        return radius;
    }

    // Phương thức getter cho diện tích (private)
    private double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức public để lấy bán kính.
    public double getCircleRadius() {
        return getRadius();
    }

    // Phương thức public để lấy diện tích
    public double getCircleArea() {
        return getArea();
    }
}

